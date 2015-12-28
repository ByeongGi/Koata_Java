-- TABOARD 스키마 
CREATE  TABLE board(
num  NUMBER(10) constraint board_num_pk primary key ,
sub VARCHAR2(100) , 
writer VARCHAR2(34) , 
pwd VARCHAR2(10) , 
cont CLOB , -- 가장 큰 문자열 타입 ! 
reip VARCHAR2(34) , 
redate DATE
);

CREATE SEQUENCE board_seq
INCREMENT by 1
START WITH 1;

