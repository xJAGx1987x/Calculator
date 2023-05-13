package Calc;

import java.awt.event.ActionEvent;

import static Calc.CalcFunctions.handleOp;

public class Calc extends javax.swing.JFrame {
    public String expression = "" ;
    public String equation = "";
    public double gamma, delta ;

    public String functionOp ;

    /**
     * Creates new form CalcFrame
     */
    public Calc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        clearAll = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        decimalButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        clearEntry = new javax.swing.JButton();
        subtractionButton = new javax.swing.JButton();
        additionButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        multButton = new javax.swing.JButton();
        exponentButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();
        displayField = new javax.swing.JTextField();
        equationField = new javax.swing.JTextField();
        negateButton = new javax.swing.JButton();
        sqrtButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        clearAll.setBackground(new java.awt.Color(102, 0, 102));
        clearAll.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearAll.setForeground(new java.awt.Color(255, 255, 255));
        clearAll.setText("CA");
        clearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllActionPerformed(evt);
            }
        });

        sevenButton.setBackground(new java.awt.Color(102, 0, 102));
        sevenButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sevenButton.setForeground(new java.awt.Color(255, 255, 255));
        sevenButton.setText("7");
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });

        fourButton.setBackground(new java.awt.Color(102, 0, 102));
        fourButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fourButton.setForeground(new java.awt.Color(255, 255, 255));
        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });

        oneButton.setBackground(new java.awt.Color(102, 0, 102));
        oneButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        oneButton.setForeground(new java.awt.Color(255, 255, 255));
        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });

        decimalButton.setBackground(new java.awt.Color(102, 0, 102));
        decimalButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        decimalButton.setForeground(new java.awt.Color(255, 255, 255));
        decimalButton.setText(".");
        decimalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalButtonActionPerformed(evt);
            }
        });

        zeroButton.setBackground(new java.awt.Color(102, 0, 102));
        zeroButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        zeroButton.setForeground(new java.awt.Color(255, 255, 255));
        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });

        twoButton.setBackground(new java.awt.Color(102, 0, 102));
        twoButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        twoButton.setForeground(new java.awt.Color(255, 255, 255));
        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });

        fiveButton.setBackground(new java.awt.Color(102, 0, 102));
        fiveButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fiveButton.setForeground(new java.awt.Color(255, 255, 255));
        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });

        eightButton.setBackground(new java.awt.Color(102, 0, 102));
        eightButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eightButton.setForeground(new java.awt.Color(255, 255, 255));
        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });

        clearEntry.setBackground(new java.awt.Color(102, 0, 102));
        clearEntry.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearEntry.setForeground(new java.awt.Color(255, 255, 255));
        clearEntry.setText("CE");
        clearEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearEntryActionPerformed(evt);
            }
        });

        subtractionButton.setBackground(new java.awt.Color(102, 0, 102));
        subtractionButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subtractionButton.setForeground(new java.awt.Color(255, 255, 255));
        subtractionButton.setText("-");
        subtractionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractionButtonActionPerformed(evt);
            }
        });

        additionButton.setBackground(new java.awt.Color(102, 0, 102));
        additionButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        additionButton.setForeground(new java.awt.Color(255, 255, 255));
        additionButton.setText("+");
        additionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionButtonActionPerformed(evt);
            }
        });

        divideButton.setBackground(new java.awt.Color(102, 0, 102));
        divideButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        divideButton.setForeground(new java.awt.Color(255, 255, 255));
        divideButton.setText("/");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        multButton.setBackground(new java.awt.Color(102, 0, 102));
        multButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        multButton.setForeground(new java.awt.Color(255, 255, 255));
        multButton.setText("*");
        multButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multButtonActionPerformed(evt);
            }
        });

        exponentButton.setBackground(new java.awt.Color(102, 0, 102));
        exponentButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exponentButton.setForeground(new java.awt.Color(255, 255, 255));
        exponentButton.setText("^");
        exponentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponentButtonActionPerformed(evt);
            }
        });

        nineButton.setBackground(new java.awt.Color(102, 0, 102));
        nineButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nineButton.setForeground(new java.awt.Color(255, 255, 255));
        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });

        sixButton.setBackground(new java.awt.Color(102, 0, 102));
        sixButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sixButton.setForeground(new java.awt.Color(255, 255, 255));
        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });

        threeButton.setBackground(new java.awt.Color(102, 0, 102));
        threeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        threeButton.setForeground(new java.awt.Color(255, 255, 255));
        threeButton.setText("3");
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });

        equalsButton.setBackground(new java.awt.Color(102, 0, 102));
        equalsButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        equalsButton.setForeground(new java.awt.Color(255, 255, 255));
        equalsButton.setText("=");
        equalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsButtonActionPerformed(evt);
            }
        });

        displayField.setBackground(new java.awt.Color(0, 0, 0));
        displayField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        displayField.setForeground(new java.awt.Color(204, 51, 255));
        displayField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        displayField.setBorder(new javax.swing.border.MatteBorder(null));

        equationField.setBackground(new java.awt.Color(0, 0, 0));
        equationField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        equationField.setForeground(new java.awt.Color(204, 51, 255));
        equationField.setBorder(new javax.swing.border.MatteBorder(null));
        equationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none(evt);
            }
        });

        negateButton.setBackground(new java.awt.Color(102, 0, 102));
        negateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        negateButton.setForeground(new java.awt.Color(255, 255, 255));
        negateButton.setText("+/-");
        negateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negateButtonActionPerformed(evt);
            }
        });

        sqrtButton.setBackground(new java.awt.Color(102, 0, 102));
        sqrtButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sqrtButton.setForeground(new java.awt.Color(255, 255, 255));
        sqrtButton.setText("√");
        sqrtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(displayField)
                        .addComponent(equationField)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(decimalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(negateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(subtractionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(additionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(clearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(fourButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(clearEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(exponentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(sqrtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(multButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(equalsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(equationField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(displayField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(clearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clearEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(exponentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(sqrtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(multButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(oneButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(additionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(decimalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(negateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(subtractionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(equalsButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        expression += fiveButton.getText();
        displayField.setText(expression) ;
    }

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {
        expression += sevenButton.getText() ;
        displayField.setText(expression) ;
    }

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {
        expression += nineButton.getText() ;
        displayField.setText(expression) ;
    }

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {
        expression += eightButton.getText();
        displayField.setText(expression );
    }

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {
        expression += sixButton.getText();
        displayField.setText(expression) ;
    }

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {
        expression += fourButton.getText();
        displayField.setText(expression);
    }

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        expression += threeButton.getText() ;
        displayField.setText(expression);
    }

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {
        expression += twoButton.getText();
        displayField.setText(expression);
    }

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {
        expression += oneButton.getText();
        displayField.setText(expression);
    }

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {
        expression += zeroButton.getText();
        displayField.setText(expression );
    }

    private void decimalButtonActionPerformed(java.awt.event.ActionEvent evt) {
        expression += decimalButton.getText();
        displayField.setText(expression);
    }

    private void multButtonActionPerformed(java.awt.event.ActionEvent evt) {
        gamma = Double.parseDouble(expression);
        functionOp = multButton.getText();
        equation += expression ;
        equation += functionOp ;
        expression = "" ;
        displayField.setText(expression) ;

    }

    private void clearAllActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        expression = "" ;
        equation = "" ;
        functionOp = "";
        gamma = 0 ;
        displayField.setText(expression);
        equationField.setText(equation) ;
    }

    private void clearEntryActionPerformed(java.awt.event.ActionEvent evt) {
        expression = "";
        displayField.setText(expression);
    }

    private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        delta = Double.parseDouble(expression) ;
        equation += expression ;
        equationField.setText(equation) ;
        double d = handleOp(gamma, delta, functionOp) ;
        gamma = d ;
        delta = 0 ;
        expression = Double.toString(gamma) ;
        displayField.setText(expression ) ;
        functionOp = "";
        equation = "";
    }

    private void exponentButtonActionPerformed(java.awt.event.ActionEvent evt) {
        gamma = Double.parseDouble(expression);
        equation += expression ;
        functionOp = exponentButton.getText();
        equation += functionOp ;
        expression = "" ;
        displayField.setText(expression) ;
    }

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {
        gamma = Double.parseDouble(expression) ;
        equation += expression ;
        functionOp = divideButton.getText() ;
        equation += functionOp ;
        expression = "";
        displayField.setText(expression) ;
    }

    private void additionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        gamma = Double.parseDouble(expression) ;
        equation += expression ;
        functionOp = additionButton.getText() ;
        equation += functionOp ;
        expression = "" ;
        displayField.setText(expression);
    }

    private void subtractionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        gamma = Double.parseDouble(expression) ;
        equation += expression ;
        functionOp = subtractionButton.getText();
        equation += functionOp ;
        expression = "";
        displayField.setText(expression) ;
    }

    private void none(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void negateButtonActionPerformed(java.awt.event.ActionEvent evt) {
     double d = Double.parseDouble(expression) ;
     d *= -1 ;
     expression = Double.toString(d) ;
     displayField.setText(expression) ;
    }

    private void sqrtButtonActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        gamma = Double.parseDouble(expression);
        equation += sqrtButton.getText() ;
        equation += expression ;
        equationField.setText(equation) ;
        equation = "" ;
        delta = CalcFunctions.sqrtFunc(gamma) ;
        expression = Double.toString(delta);
        displayField.setText(expression) ;
        gamma = delta ;
        delta = 0 ;

    }

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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton additionButton;
    private javax.swing.JButton clearAll;
    private javax.swing.JButton clearEntry;
    private javax.swing.JButton decimalButton;
    private javax.swing.JTextField displayField;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JTextField equationField;
    private javax.swing.JButton exponentButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multButton;
    private javax.swing.JButton negateButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton sqrtButton;
    private javax.swing.JButton subtractionButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration
}