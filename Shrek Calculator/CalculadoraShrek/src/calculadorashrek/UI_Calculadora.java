/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorashrek;

/**
 *
 * @author Matheus Camargo
 */
public class UI_Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form UI_Calculadora
     */
    public UI_Calculadora() {
        initComponents();
    }
    
    Double valor1, valor2, resultado;
    String operacao;
    boolean urrado;
    boolean igual;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        Visor = new javax.swing.JTextField();
        LblHistorico = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        BtnDiv = new javax.swing.JButton();
        BtnMult = new javax.swing.JButton();
        BtnMinus = new javax.swing.JButton();
        BtnEqual = new javax.swing.JButton();
        BtnClean = new javax.swing.JButton();
        BtnPlus = new javax.swing.JButton();
        LblShrek = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Visor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Visor)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LblHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(LblHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Visor, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Btn7.setText("7");
        Btn7.setPreferredSize(new java.awt.Dimension(75, 50));
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        Btn8.setText("8");
        Btn8.setPreferredSize(new java.awt.Dimension(75, 50));
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn9.setText("9");
        Btn9.setPreferredSize(new java.awt.Dimension(75, 50));
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        Btn4.setText("4");
        Btn4.setPreferredSize(new java.awt.Dimension(75, 50));
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn5.setText("5");
        Btn5.setPreferredSize(new java.awt.Dimension(75, 50));
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn6.setText("6");
        Btn6.setPreferredSize(new java.awt.Dimension(75, 50));
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        Btn1.setText("1");
        Btn1.setPreferredSize(new java.awt.Dimension(75, 50));
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn2.setText("2");
        Btn2.setPreferredSize(new java.awt.Dimension(75, 50));
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn3.setText("3");
        Btn3.setPreferredSize(new java.awt.Dimension(75, 50));
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn0.setText("0");
        Btn0.setPreferredSize(new java.awt.Dimension(75, 50));
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0ActionPerformed(evt);
            }
        });

        BtnDiv.setText("÷");
        BtnDiv.setPreferredSize(new java.awt.Dimension(75, 50));
        BtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivActionPerformed(evt);
            }
        });

        BtnMult.setText("x");
        BtnMult.setPreferredSize(new java.awt.Dimension(75, 50));
        BtnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultActionPerformed(evt);
            }
        });

        BtnMinus.setText("-");
        BtnMinus.setPreferredSize(new java.awt.Dimension(75, 50));
        BtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMinusActionPerformed(evt);
            }
        });

        BtnEqual.setBackground(new java.awt.Color(102, 153, 255));
        BtnEqual.setText("=");
        BtnEqual.setPreferredSize(new java.awt.Dimension(75, 50));
        BtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqualActionPerformed(evt);
            }
        });

        BtnClean.setText("C");
        BtnClean.setPreferredSize(new java.awt.Dimension(75, 50));
        BtnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCleanActionPerformed(evt);
            }
        });

        BtnPlus.setText("+");
        BtnPlus.setPreferredSize(new java.awt.Dimension(75, 50));
        BtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LblShrek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadorashrek/unnamed.png"))); // NOI18N
        LblShrek.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LblShrek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblShrekMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblShrek, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(LblShrek, javax.swing.GroupLayout.PREFERRED_SIZE, 485, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VisorActionPerformed

    private void BtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlusActionPerformed
        if (urrado) {
            urrado = false;
            Visor.setText("");
            valor1 = null;
            valor2 = null;
            resultado = null;
            LblHistorico.setText("");
        }
        valor1 = Double.parseDouble(Visor.getText());
        operacao = "somar";
        LblHistorico.setText(LblHistorico.getText()+" + ");
        Visor.setText("");
    }//GEN-LAST:event_BtnPlusActionPerformed

    private void BtnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCleanActionPerformed
        Visor.setText("");
        valor1 = null;
        valor2 = null;
        resultado = null;
        LblHistorico.setText("");
    }//GEN-LAST:event_BtnCleanActionPerformed

    private void BtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqualActionPerformed
        if (urrado) {
            urrado = false;
            Visor.setText("");
            valor1 = null;
            valor2 = null;
            resultado = null;
            LblHistorico.setText("");
        }
        valor2 = Double.parseDouble(Visor.getText());
        LblHistorico.setText(LblHistorico.getText()+" ");

        switch(operacao) {
            case "somar":
            resultado = valor1 + valor2;
            Visor.setText(String.valueOf(resultado));
            break;

            case "sub":
            resultado = valor1 - valor2;
            Visor.setText(String.valueOf(resultado));
            break;

            case "mult":
            resultado = valor1 * valor2;
            Visor.setText(String.valueOf(resultado));
            break;

            case "div":
            resultado = valor1 / valor2;
            Visor.setText(String.valueOf(resultado));
            break;
        }
        LblHistorico.setText(String.valueOf(resultado)+" ");
        igual = true;
    }//GEN-LAST:event_BtnEqualActionPerformed

    private void BtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMinusActionPerformed
        if (urrado) {
            urrado = false;
            Visor.setText("");
            valor1 = null;
            valor2 = null;
            resultado = null;
            LblHistorico.setText("");
        }
        valor1 = Double.parseDouble(Visor.getText());
        operacao = "sub";
        LblHistorico.setText(LblHistorico.getText()+" - ");
        Visor.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMinusActionPerformed

    private void BtnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultActionPerformed
        if (urrado) {
            urrado = false;
            Visor.setText("");
            valor1 = null;
            valor2 = null;
            resultado = null;
            LblHistorico.setText("");
        }
        valor1 = Double.parseDouble(Visor.getText());
        operacao = "mult";
        LblHistorico.setText(LblHistorico.getText()+" * ");
        Visor.setText("");    // TODO add your handling code here:
    }//GEN-LAST:event_BtnMultActionPerformed

    private void BtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivActionPerformed
        if (urrado) {
            urrado = false;
            Visor.setText("");
            valor1 = null;
            valor2 = null;
            resultado = null;
            LblHistorico.setText("");
        }
        valor1 = Double.parseDouble(Visor.getText());
        operacao = "div";
        LblHistorico.setText(LblHistorico.getText()+" ÷ ");
        Visor.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_BtnDivActionPerformed

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        if (urrado) {
            urrado = false;
            Visor.setText("");
            valor1 = null;
            valor2 = null;
            resultado = null;
            LblHistorico.setText("");
        }
        Visor.setText(Visor.getText()+"0");
        LblHistorico.setText(LblHistorico.getText()+"0");    // TODO add your handling code here:
    }//GEN-LAST:event_Btn0ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        if (urrado) {
            urrado = false;
            Visor.setText("");
            valor1 = null;
            valor2 = null;
            resultado = null;
            LblHistorico.setText("");
        }
        Visor.setText(Visor.getText()+"3");
        LblHistorico.setText(LblHistorico.getText()+"3");// TODO add your handling code here:
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        if (urrado) {
            urrado = false;
            Visor.setText("");
            valor1 = null;
            valor2 = null;
            resultado = null;
            LblHistorico.setText("");
        }
        Visor.setText(Visor.getText()+"2");
        LblHistorico.setText(LblHistorico.getText()+"2");    // TODO add your handling code here:
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        if (urrado) {
            urrado = false;
            Visor.setText("");
            valor1 = null;
            valor2 = null;
            resultado = null;
            LblHistorico.setText("");
        }
        Visor.setText(Visor.getText()+"1");
        LblHistorico.setText(LblHistorico.getText()+"1");     // TODO add your handling code here:
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        if (urrado) {
            urrado = false;
            Visor.setText("");
            valor1 = null;
            valor2 = null;
            resultado = null;
            LblHistorico.setText("");
        }
        Visor.setText(Visor.getText()+"6");
        LblHistorico.setText(LblHistorico.getText()+"6");    // TODO add your handling code here:
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        if (urrado) {
            urrado = false;
            Visor.setText("");
            valor1 = null;
            valor2 = null;
            resultado = null;
            LblHistorico.setText("");
        }
        Visor.setText(Visor.getText()+"5");
        LblHistorico.setText(LblHistorico.getText()+"5");    // TODO add your handling code here:
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        if (urrado) {
            urrado = false;
            Visor.setText("");
            valor1 = null;
            valor2 = null;
            resultado = null;
            LblHistorico.setText("");
        }
        Visor.setText(Visor.getText()+"4");
        LblHistorico.setText(LblHistorico.getText()+"4");    // TODO add your handling code here:
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        if (urrado) {
            urrado = false;
            Visor.setText("");
            valor1 = null;
            valor2 = null;
            resultado = null;
            LblHistorico.setText("");
        }
        Visor.setText(Visor.getText()+"9");
        LblHistorico.setText(LblHistorico.getText()+"9");    // TODO add your handling code here:
    }//GEN-LAST:event_Btn9ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        if (urrado) {
            urrado = false;
            Visor.setText("");
            valor1 = null;
            valor2 = null;
            resultado = null;
            LblHistorico.setText("");
        }
        Visor.setText(Visor.getText()+"8");
        LblHistorico.setText(LblHistorico.getText()+"8");     // TODO add your handling code here:
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        if (urrado) {
            urrado = false;
            Visor.setText("");
            valor1 = null;
            valor2 = null;
            resultado = null;
            LblHistorico.setText("");
        }
        Visor.setText(Visor.getText()+"7");
        LblHistorico.setText(LblHistorico.getText()+"7");    // TODO add your handling code here:
    }//GEN-LAST:event_Btn7ActionPerformed

    private void LblShrekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblShrekMouseClicked
        Visor.setText("FAZ O URRU");
        LblHistorico.setText("SHREKAO");
        urrado = true;        // TODO add your handling code here:
    }//GEN-LAST:event_LblShrekMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UI_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnClean;
    private javax.swing.JButton BtnDiv;
    private javax.swing.JButton BtnEqual;
    private javax.swing.JButton BtnMinus;
    private javax.swing.JButton BtnMult;
    private javax.swing.JButton BtnPlus;
    private javax.swing.JLabel LblHistorico;
    private javax.swing.JLabel LblShrek;
    private javax.swing.JTextField Visor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
