/*
 * Created by: Dan Smith
 * This class is the first screen of the GUI.  It allows the user to select the Difficulty Level.
 */
package sudokugenerator;

import javax.swing.JOptionPane;

public class Start extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    public Start() {
        initComponents();
    }
    
    private void displayRules() {
        StringBuilder rulesmsg = new StringBuilder();
        rulesmsg.append("Rules:\n\n");
        rulesmsg.append("The classic Sudoku game involves a grid of 81 squares.\n"
                + "The grid is divided into nine blocks, each containing nine squares.\n"
                + "The rules of the game are simple:\n"
                + "each of the nine blocks has to contain all the numbers 1-9 within its squares.\n"
                + "Each number can only appear once in a row, column or box.\n");
        
        JOptionPane.showMessageDialog(null,
                                      rulesmsg,
                                      "Sudoku",
                                      JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        difficultylevelbuttongroup = new javax.swing.ButtonGroup();
        BeginnerButton = new javax.swing.JRadioButton();
        EasyButton = new javax.swing.JRadioButton();
        MediumButton = new javax.swing.JRadioButton();
        HardButton = new javax.swing.JRadioButton();
        ImpossibleButton = new javax.swing.JRadioButton();
        difficultylevellabel = new javax.swing.JLabel();
        sudokulabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        sudokuimagelabel = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();
        creatorlabel = new javax.swing.JLabel();
        rulebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        difficultylevelbuttongroup.add(BeginnerButton);
        BeginnerButton.setSelected(true);
        BeginnerButton.setText("Beginner");

        difficultylevelbuttongroup.add(EasyButton);
        EasyButton.setText("Easy");

        difficultylevelbuttongroup.add(MediumButton);
        MediumButton.setText("Medium");

        difficultylevelbuttongroup.add(HardButton);
        HardButton.setText("Hard");

        difficultylevelbuttongroup.add(ImpossibleButton);
        ImpossibleButton.setText("Impossible");

        difficultylevellabel.setText("Select Difficulty Level:");

        sudokulabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sudokulabel.setText("SUDOKU");

        sudokuimagelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudokugenerator/sudoku.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sudokuimagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(sudokuimagelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        creatorlabel.setText("Created By: Dan Smith");

        rulebutton.setText("Rules");
        rulebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rulebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BeginnerButton)
                    .addComponent(difficultylevellabel)
                    .addComponent(EasyButton)
                    .addComponent(MediumButton)
                    .addComponent(HardButton)
                    .addComponent(sudokulabel)
                    .addComponent(ImpossibleButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rulebutton)
                            .addComponent(StartButton))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(creatorlabel)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(sudokulabel)
                        .addGap(18, 18, 18)
                        .addComponent(difficultylevellabel)
                        .addGap(18, 18, 18)
                        .addComponent(BeginnerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EasyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MediumButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HardButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ImpossibleButton)
                        .addGap(26, 26, 26)
                        .addComponent(StartButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rulebutton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(creatorlabel)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        int difflevel = 0;
        
        if (BeginnerButton.isSelected()){
            difflevel = DifficultyLevel.BEGINNER.getDifficultyLevel();
        } else if (EasyButton.isSelected()){
            difflevel = DifficultyLevel.EASY.getDifficultyLevel();
        } else if (MediumButton.isSelected()){
            difflevel = DifficultyLevel.MEDIUM.getDifficultyLevel();
        } else if (HardButton.isSelected()){
            difflevel = DifficultyLevel.HARD.getDifficultyLevel();
        } else if (ImpossibleButton.isSelected()){
            difflevel = DifficultyLevel.IMPOSSIBLE.getDifficultyLevel();
        }
        
        Input input = new Input(difflevel);
        input.pack();
        input.setLocationRelativeTo(null);
        input.setTitle("Sudoku");
        input.setVisible(true);
    }//GEN-LAST:event_StartButtonActionPerformed

    private void rulebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rulebuttonActionPerformed
        // TODO add your handling code here:
        displayRules();
    }//GEN-LAST:event_rulebuttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BeginnerButton;
    private javax.swing.JRadioButton EasyButton;
    private javax.swing.JRadioButton HardButton;
    private javax.swing.JRadioButton ImpossibleButton;
    private javax.swing.JRadioButton MediumButton;
    private javax.swing.JButton StartButton;
    private javax.swing.JLabel creatorlabel;
    private javax.swing.ButtonGroup difficultylevelbuttongroup;
    private javax.swing.JLabel difficultylevellabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rulebutton;
    private javax.swing.JLabel sudokuimagelabel;
    private javax.swing.JLabel sudokulabel;
    // End of variables declaration//GEN-END:variables
}
