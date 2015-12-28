package project.UI;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import proejct.dao.MemberDao;
import proejct.vo.MemberVo;

public class PCRoom extends javax.swing.JFrame {

    private CardLayout card;

    private int sesssionNum;

    public PCRoom() {
        initComponents();
        card = (CardLayout) pp.getLayout();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel28 = new javax.swing.JLabel();
        pp = new javax.swing.JPanel();
        main = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idMv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pwdMv = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        join = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        idv = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pwdv = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        namev = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        addv = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        emailv = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        telv = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        userMain = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        timev = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        payv = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        usridvvv = new javax.swing.JTextField();
        userInfo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        idInfov = new javax.swing.JTextField();
        pwdInfov = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        nameInfov = new javax.swing.JTextField();
        addInfov = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        emailInfov = new javax.swing.JTextField();
        telInfov = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        manager = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        userNamev = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userv = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        delNumv = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        payChargev = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel10.setText("jLabel10");

        jLabel12.setText("jLabel12");

        jLabel28.setText("jLabel28");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pp.setLayout(new java.awt.CardLayout());

        main.setBackground(new java.awt.Color(0, 0, 0));
        main.setForeground(new java.awt.Color(255, 0, 0));

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("ID : ");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("PWD : ");

        jLabel4.setFont(new java.awt.Font("휴먼옛체", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("E PC 방");

        jButton1.setText("로그인");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("회원가입");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(119, 119, 119)
                .addComponent(jButton2)
                .addGap(152, 152, 152))
            .addGroup(mainLayout.createSequentialGroup()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(44, 44, 44)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idMv)
                            .addComponent(pwdMv, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idMv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pwdMv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pp.add(main, "main");

        join.setBackground(new java.awt.Color(255, 204, 102));
        join.setPreferredSize(new java.awt.Dimension(578, 446));

        jLabel9.setFont(new java.awt.Font("휴먼옛체", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 51, 0));
        jLabel9.setText("E PC 방 회원 가입");

        jLabel11.setText("Id : ");

        jLabel13.setText("Pwd : ");

        jLabel14.setText("Name : ");

        jLabel15.setText("Address : ");

        jLabel16.setText("Email : ");

        jLabel17.setText("Gender : ");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("여자");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("남자");

        jLabel18.setText("Tel : ");

        jButton8.setText("가입하기");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton13.setText("뒤로가기");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout joinLayout = new javax.swing.GroupLayout(join);
        join.setLayout(joinLayout);
        joinLayout.setHorizontalGroup(
            joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(joinLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(43, 43, 43)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(joinLayout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(jRadioButton2))
                    .addComponent(pwdv)
                    .addComponent(namev)
                    .addComponent(addv)
                    .addComponent(emailv)
                    .addComponent(idv)
                    .addComponent(telv))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joinLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joinLayout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joinLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))))
        );
        joinLayout.setVerticalGroup(
            joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(joinLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(idv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(pwdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(namev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(addv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(emailv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(telv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton13))
                .addGap(25, 25, 25))
        );

        pp.add(join, "join");

        userMain.setBackground(new java.awt.Color(102, 0, 102));

        jLabel5.setForeground(new java.awt.Color(255, 204, 204));
        jLabel5.setText("회원 ID : ");

        timev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timevActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 204, 204));
        jLabel6.setText("충전 금액 : ");

        jButton3.setText("정보수정");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("로그아웃");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("휴먼옛체", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("E PC 방");

        jLabel30.setForeground(new java.awt.Color(255, 204, 204));
        jLabel30.setText("남은 시간 : ");

        usridvvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usridvvvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userMainLayout = new javax.swing.GroupLayout(userMain);
        userMain.setLayout(userMainLayout);
        userMainLayout.setHorizontalGroup(
            userMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userMainLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(userMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userMainLayout.createSequentialGroup()
                            .addGroup(userMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(userMainLayout.createSequentialGroup()
                                    .addComponent(jButton3)
                                    .addGap(150, 150, 150))
                                .addGroup(userMainLayout.createSequentialGroup()
                                    .addGroup(userMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel30))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(userMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(payv, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(timev, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(129, 129, 129)))
                            .addComponent(jButton4)
                            .addGap(140, 140, 140))
                        .addGroup(userMainLayout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(usridvvv, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userMainLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(371, 371, 371))))
        );
        userMainLayout.setVerticalGroup(
            userMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userMainLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(userMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usridvvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(userMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(payv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(userMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(102, 102, 102))
        );

        pp.add(userMain, "userMain");

        userInfo.setBackground(new java.awt.Color(0, 102, 102));

        jLabel8.setFont(new java.awt.Font("굴림", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 204));
        jLabel8.setText("내 정보");

        jButton5.setText("회원수정");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("회원탈퇴");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("돌아가기");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(204, 255, 255));
        jLabel19.setText("Id (수정불가) :");

        jLabel20.setForeground(new java.awt.Color(204, 255, 255));
        jLabel20.setText("Pwd : ");

        jLabel21.setForeground(new java.awt.Color(204, 255, 255));
        jLabel21.setText("Name (수정불가)  : ");

        jLabel22.setForeground(new java.awt.Color(204, 255, 255));
        jLabel22.setText("Address : ");

        jLabel23.setForeground(new java.awt.Color(204, 255, 255));
        jLabel23.setText("Email : ");

        jLabel24.setForeground(new java.awt.Color(204, 255, 255));
        jLabel24.setText("Tel : ");

        jLabel25.setForeground(new java.awt.Color(204, 255, 255));
        jLabel25.setText("Gender (수정불가)  : ");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("여자");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("남자");

        javax.swing.GroupLayout userInfoLayout = new javax.swing.GroupLayout(userInfo);
        userInfo.setLayout(userInfoLayout);
        userInfoLayout.setHorizontalGroup(
            userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInfoLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(userInfoLayout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(102, 102, 102)
                        .addComponent(jButton6)
                        .addGap(95, 95, 95)
                        .addComponent(jButton7)))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(userInfoLayout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addGroup(userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20)
                        .addComponent(jLabel21)
                        .addComponent(jLabel22)
                        .addComponent(jLabel23)
                        .addComponent(jLabel25)
                        .addComponent(jLabel24))
                    .addGap(43, 43, 43)
                    .addGroup(userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(userInfoLayout.createSequentialGroup()
                            .addComponent(jRadioButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                            .addComponent(jRadioButton4))
                        .addComponent(pwdInfov)
                        .addComponent(nameInfov)
                        .addComponent(addInfov)
                        .addComponent(emailInfov)
                        .addComponent(idInfov)
                        .addComponent(telInfov))
                    .addContainerGap(53, Short.MAX_VALUE)))
        );
        userInfoLayout.setVerticalGroup(
            userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInfoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, Short.MAX_VALUE)
                .addGroup(userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton7)
                    .addComponent(jButton6))
                .addGap(33, 33, 33))
            .addGroup(userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(userInfoLayout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addGroup(userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(idInfov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(pwdInfov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(nameInfov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel22)
                        .addComponent(addInfov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(emailInfov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(jRadioButton3)
                        .addComponent(jRadioButton4))
                    .addGap(18, 18, 18)
                    .addGroup(userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(telInfov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(95, Short.MAX_VALUE)))
        );

        pp.add(userInfo, "userInfo");

        manager.setBackground(new java.awt.Color(153, 102, 0));

        jLabel26.setText("사용자 이름 : ");

        userNamev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNamevActionPerformed(evt);
            }
        });

        jButton9.setText("검색");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        userv.setColumns(20);
        userv.setRows(5);
        jScrollPane1.setViewportView(userv);

        jLabel27.setText("회원 번호 : ");

        jButton10.setText("삭제");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("로그아웃");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel29.setText("충전금액 : ");

        jButton12.setText("충전");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout managerLayout = new javax.swing.GroupLayout(manager);
        manager.setLayout(managerLayout);
        managerLayout.setHorizontalGroup(
            managerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managerLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(managerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managerLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(managerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managerLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(36, 36, 36)
                                .addComponent(userNamev, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jButton9)
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managerLayout.createSequentialGroup()
                                .addComponent(jButton11)
                                .addGap(35, 35, 35))))
                    .addGroup(managerLayout.createSequentialGroup()
                        .addGroup(managerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29))
                        .addGap(27, 27, 27)
                        .addGroup(managerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(delNumv, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(payChargev))
                        .addGap(38, 38, 38)
                        .addGroup(managerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10)
                            .addComponent(jButton12)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managerLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        managerLayout.setVerticalGroup(
            managerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(managerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(userNamev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(managerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(delNumv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addGap(18, 18, 18)
                .addGroup(managerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(payChargev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12))
                .addGap(12, 12, 12)
                .addComponent(jButton11)
                .addGap(32, 32, 32))
        );

        pp.add(manager, "manager");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewList() {  //디테일한 사용자 정보 출력하는 메소드
        MemberDao dao = new MemberDao();
        ArrayList<MemberVo> list = dao.listMember();

        for (MemberVo e : list) {
            if (e.getMNum() == sesssionNum) { 
                idInfov.setText(e.getMId());
                pwdInfov.setText(e.getMPwd());
                nameInfov.setText(e.getMName());
                addInfov.setText(e.getMAddr());
                emailInfov.setText(e.getMEmail());
                telInfov.setText(e.getMTel());

                if (e.getMGender().equals("여자")) {
                    jRadioButton3.setSelected(true);
                } else {
                    jRadioButton4.setSelected(true);
                }
            }
        }
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        String mId = idv.getText().trim();
        String mName = namev.getText().trim();
        String mPwd = pwdv.getText().trim();
        String mAddr = addv.getText().trim();
        String mEmail = emailv.getText().trim();

        String mGender = "";
        String mTel = telv.getText().trim();

        if (jRadioButton1.isSelected()) {
            mGender = "여자";
        } else {
            mGender = "남자";
        }

        MemberDao dao = new MemberDao();
        MemberVo vo = new MemberVo();
        vo.setMId(mId);
        vo.setMName(mName);
        vo.setMPwd(mPwd);
        vo.setMAddr(mAddr);
        vo.setMEmail(mEmail);
        vo.setMGender(mGender);
        vo.setMTel(mTel);

        int result =  dao.insertMember(vo);
        if(result > 0) {
            JOptionPane.showMessageDialog(this, "가입을 축하드립니다.");
        } else {
            JOptionPane.showMessageDialog(this, "잠시후 다시 가입해주세요");
        }
        card.show(pp, "main");
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        idMv.setText("");
        pwdMv.setText("");
        idMv.requestFocus();
        card.show(pp, "main");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        card.show(pp, "userInfo");
        viewList();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        card.show(pp, "userMain");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        idv.setText("");
        namev.setText("");
        pwdv.setText("");
        addv.setText("");
        emailv.setText("");
        telv.setText("");
        buttonGroup1.clearSelection();

        card.show(pp, "join");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // role : 0일때 관리자, 1일때 사용자
        // card.show(pp, "userMain");
        MemberDao dao = new MemberDao();
        MemberVo vo;
        try {
            vo = dao.vaildate(idMv.getText().trim(), pwdMv.getText().trim());
            int mRole = Integer.parseInt(vo.getMRole());
            if (mRole == 0) {
                userv.setText("");
                userNamev.setText("");
                delNumv.setText("");
                payChargev.setText("");
                card.show(pp, "manager");
                sesssionNum = vo.getMNum();  //MNum 멤버필드에 저장

            } else if (mRole == 1 && vo.getPayment() > 0) {
                usridvvv.setText(vo.getMName());

                int time = ((int) (vo.getPayment() / 1000));//금액을 계산시간으로 계산
                timev.setText(time + "시간");
                payv.setText(String.valueOf(vo.getPayment()));
                card.show(pp, "userMain");
                sesssionNum = vo.getMNum();
            } else {
                JOptionPane.showMessageDialog(this, "충전 금액이 없습니다. 충전 뒤에 이용해주세요.");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "아이디와 패스워드가 틀렸습니다. 다시 로그인하세요!");
            idMv.setText("");
            pwdMv.setText("");
            idMv.requestFocus();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        MemberDao dao = new MemberDao();
        MemberVo vo = new MemberVo();
        int res = 0;

        vo.setMNum(sesssionNum);
        vo.setMPwd(pwdInfov.getText().trim());
        vo.setMAddr(addInfov.getText().trim());
        vo.setMEmail(emailInfov.getText().trim());
        vo.setMTel(telInfov.getText().trim());

        res = dao.u_p_Info(vo);
        if (res > 0) {
            JOptionPane.showMessageDialog(this, "수정되었습니다.");
        } else {
            JOptionPane.showMessageDialog(this, "다시 입력해주세요.");
        }
        viewList();


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        MemberDao dao = new MemberDao();

        int delResult = JOptionPane.showConfirmDialog(this, "정말로 삭제하시겠습니까?", null, WIDTH);
        System.out.println("정말로 탈퇴 하시겠습니까?" + delResult);  //삭제 0   //아니오 1

        if (delResult == 0) {
            dao.deleteMember(sesssionNum); // 고객 번호 
            idMv.setText("");
            pwdMv.setText("");
            idMv.requestFocus();
            card.show(pp, "main");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        //매니저 로그아웃
        idMv.setText("");
        pwdMv.setText("");
        idMv.requestFocus();
        card.show(pp, "main");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void userNamevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNamevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNamevActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        card.show(pp, "main");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //검색!!!

        userv.setText("");
        MemberDao dao = new MemberDao();
        ArrayList<MemberVo> list;
        String MName = userNamev.getText().trim();
        list = dao.p_Info(MName);

        userv.append("손님번호\t이름\t아이디\t보유잔액\t전화번호\t   가입일\n");
        for (MemberVo vo : list) {
            userv.append(String.valueOf(vo.getMNum()) + "\t");  // \n  개행 // \t tab  
            userv.append(vo.getMName() + "\t");
            userv.append(vo.getMId() + "\t");
            userv.append(vo.getPayment() + "\t");
            userv.append(vo.getMTel() + "\t   ");
            userv.append(vo.getMRegDate() + "\n");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //manager 가 강제삭제!! 

        MemberDao dao = new MemberDao();

        int delN = Integer.parseInt(delNumv.getText().trim());

        int delResult = JOptionPane.showConfirmDialog(this, "정말로 탈퇴 시키겠습니다까?", null, WIDTH);
        System.out.println("매니저가 강제삭제" + delResult);  //삭제 0   //아니오 1

        if (delResult == 0) {
            dao.deleteMember(delN);
            delNumv.setText("");
            userv.setText("");
            userNamev.setText("");
            userNamev.requestFocus();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void timevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timevActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        //금액 추가
        int mNum = Integer.parseInt(delNumv.getText().trim());
        int payC = Integer.parseInt(payChargev.getText().trim());
        MemberDao dao = new MemberDao();
        int result = dao.payCharge(mNum, payC);
//
        JOptionPane.showMessageDialog(this, "충전되었습니다..");

        userv.setText("");
        ArrayList<MemberVo> list;
        String MName = userNamev.getText().trim();
        list = dao.p_Info(MName);

        userv.append("손님번호\t이름\t아이디\t보유잔액\t전화번호\t   가입일\n");
        for (MemberVo vo : list) {
            userv.append(String.valueOf(vo.getMNum()) + "\t");
            userv.append(vo.getMName() + "\t");
            userv.append(vo.getMId() + "\t");
            userv.append(vo.getPayment() + "\t");
            userv.append(vo.getMTel() + "\t   ");
            userv.append(vo.getMRegDate() + "\n");

        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void usridvvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usridvvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usridvvvActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PCRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PCRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PCRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PCRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PCRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addInfov;
    private javax.swing.JTextField addv;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField delNumv;
    private javax.swing.JTextField emailInfov;
    private javax.swing.JTextField emailv;
    private javax.swing.JTextField idInfov;
    private javax.swing.JTextField idMv;
    private javax.swing.JTextField idv;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel join;
    private javax.swing.JPanel main;
    private javax.swing.JPanel manager;
    private javax.swing.JTextField nameInfov;
    private javax.swing.JTextField namev;
    private javax.swing.JTextField payChargev;
    private javax.swing.JTextField payv;
    private javax.swing.JPanel pp;
    private javax.swing.JTextField pwdInfov;
    private javax.swing.JPasswordField pwdMv;
    private javax.swing.JTextField pwdv;
    private javax.swing.JTextField telInfov;
    private javax.swing.JTextField telv;
    private javax.swing.JTextField timev;
    private javax.swing.JPanel userInfo;
    private javax.swing.JPanel userMain;
    private javax.swing.JTextField userNamev;
    private javax.swing.JTextArea userv;
    private javax.swing.JTextField usridvvv;
    // End of variables declaration//GEN-END:variables
}
