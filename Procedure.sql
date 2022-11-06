set SERVEROUTPUT ON;

-------------------------------------------------------------
-- Procedure 1
-------------------------------------------------------------
create or replace PROCEDURE SANPHAMNHIEUNHAT_NAM(NAM NUMBER)   
    IS
F_MASP CTHD.MASP%TYPE;
F_TENSP SANPHAM.TENSP%TYPE;
    BEGIN
        SELECT CT.MASP, SP.TENSP INTO F_MASP,F_TENSP
        FROM (SANPHAM SP JOIN CTHD CT ON SP.MASP = CT.MASP) JOIN HOADON HD ON CT.SOHD = HD.SOHD
        WHERE EXTRACT (YEAR FROM NGAYHD) = NAM
        GROUP BY CT.MASP, SP.TENSP
        HAVING SUM(CT.SOLUONG) >= ALL(SELECT SUM(CT2.SOLUONG)
							  FROM CTHD CT2 JOIN HOADON HD2 ON CT2.SOHD = HD2.SOHD
							  WHERE EXTRACT (YEAR FROM NGAYHD) = NAM
							  GROUP BY CT2.MASP);     
        DBMS_OUTPUT.PUT_LINE ('SAN PHAM CO SO LUONG MUA NHIEU NHAT NAM ' || NAM || ' LA: '||F_MASP || ' ' || F_TENSP); 
        EXCEPTION
        WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE ('SAN PHAM KO CO TRONG NAM '|| NAM );
    END;
-------THUC THI
exec SANPHAMNHIEUNHAT_NAM(2021);

-------------------------------------------------------------
-- Procedure 2
-------------------------------------------------------------
create or replace procedure Timhoadon_NV( THANG NUMBER) 
AS
        P_MANV NHANVIEN.MANV % TYPE;
        P_HOTEN NHANVIEN.HOTENNV % TYPE;
        P_SOLUONG NUMBER;


CURSOR DSHOADON IS  SELECT DISTINCT HD.MANV,NV.HOTENNV, COUNT(*) AS SOLUONG
                    FROM NHANVIEN NV JOIN HOADON HD ON NV.MANV = HD.MANV
                    WHERE EXTRACT(MONTH FROM NGAYHD) = THANG
                    GROUP BY HD.MANV,NV.HOTENNV;

  P_LOAITK TAIKHOAN.LOAITK%TYPE;

CURSOR DSLOAITK IS  SELECT TK.LOAITK 
                    FROM TAIKHOAN TK 
                    WHERE TK.MANGUOIDUNG = P_MANV;

BEGIN

OPEN DSHOADON;
LOOP
    FETCH DSHOADON INTO P_MANV,P_HOTEN,P_SOLUONG;
    EXIT WHEN DSHOADON%NOTFOUND;
    DBMS_OUTPUT.PUT_LINE (P_MANV || ' ' || P_HOTEN || ' '|| P_SOLUONG || ' ');
    OPEN DSLOAITK;
        LOOP
        FETCH DSLOAITK INTO P_LOAITK;
        EXIT WHEN DSLOAITK%NOTFOUND;
      DBMS_OUTPUT.PUT_LINE (P_LOAITK);  
        END LOOP;
        CLOSE DSLOAITK;
        END LOOP;
        CLOSE DSHOADON;
END;
-------THUC THI
DECLARE 
    THANG NUMBER ;
    BEGIN
    THANG:=&THANG;
    Timhoadon_NV(THANG);
    END;