
-- spring security 
CREATE TABLE employees(
USERNAME VARCHAR2(20) CONSTRAINT EMPS_USERNAME_PK PRIMARY KEY, -- PRICIPLE
PASSWORD VARCHAR2(20) CONSTRAINT EMPS_PASSWORD_NN NOT NULL, -- 크리덴셜
ENABLED NUMBER(2) NOT NULL -- 인증 확인
);

--  spring role 
CREATE TABLE ROLES(
USERNAME VARCHAR2(20) CONSTRAINT emps_username_nn NOT NULL,
ROLE VARCHAR2(20) CONSTRAINT ROLES_ROLE_NN NOT NULL,
CONSTRAINT ROLES_USER_ROLE_PK PRIMARY KEY(USERNAME,ROLE) -- 두개의 컬럼을 묶어서 PK로 지정하는 방법 
);	
