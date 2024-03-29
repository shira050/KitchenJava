/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitchenmenneger;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author comp2
 */
public class Kitchen extends javax.swing.JFrame {

    /**
     * Creates new form Kitchen
     */
    private List<Recipe> recipes;
    private List<CookWare> cookwares;

    public Kitchen() {
        initRecipes();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ovenUseTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        napaTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        mixerTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        potTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        gazTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ovenTable1 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        gazUseTable = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        potUseTable = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        mixerUseTable = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        napaUseTable = new javax.swing.JTable();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kitchenmenneger/images/תנור.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kitchenmenneger/images/נפה.jpg"))); // NOI18N
        jLabel5.setName("napa"); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kitchenmenneger/images/סיר_1.gif"))); // NOI18N
        jLabel6.setName("sir"); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kitchenmenneger/images/גז.jpg"))); // NOI18N
        jLabel7.setName("gaz"); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kitchenmenneger/images/מיקסר.jpg"))); // NOI18N
        jLabel8.setName("mixer"); // NOI18N

        ovenUseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "רשימת משתמשים "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ovenUseTable);

        napaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "רשימת ממתינים"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(napaTable);

        mixerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "רשימת ממתינים"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(mixerTable);

        potTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "רשימת ממתינים"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(potTable);

        gazTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "רשימת ממתינים"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(gazTable);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel9.setText("ניהול מטבח");

        ovenTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "רשימת ממתינים"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(ovenTable1);

        gazUseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "רשימת משתמשים "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane8.setViewportView(gazUseTable);

        potUseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "רשימת משתמשים "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane9.setViewportView(potUseTable);

        mixerUseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "רשימת משתמשים "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane10.setViewportView(mixerUseTable);

        napaUseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "רשימת משתמשים "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane11.setViewportView(napaUseTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(110, 110, 110)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel8)
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(511, 511, 511))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(50, 50, 50)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(88, 88, 88)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable gazTable;
    private javax.swing.JTable gazUseTable;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable mixerTable;
    private javax.swing.JTable mixerUseTable;
    public javax.swing.JTable napaTable;
    private javax.swing.JTable napaUseTable;
    private javax.swing.JTable ovenTable1;
    private javax.swing.JTable ovenUseTable;
    private javax.swing.JTable potTable;
    private javax.swing.JTable potUseTable;
    // End of variables declaration//GEN-END:variables

    private void initRecipes() {
        //לאתחל נתוני משאבים ולאתחל נתוני מתכונים
        setRecipes(new ArrayList<>());

    }

    /**
     * @return the recipes
     */
    public List<Recipe> getRecipes() {
        return recipes;
    }

    /**
     * @param recipes the recipes to set
     */
    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    /**
     * @return the cookwares
     */
    public List<CookWare> getCookwares() {
        return cookwares;
    }

    /**
     * @param cookwares the cookwares to set
     */
    public void setCookwares(List<CookWare> cookwares) {
        this.cookwares = cookwares;
    }

    /**
     * @return the gazTable
     */
    public javax.swing.JTable getGazTable() {
        return gazTable;
    }

    /**
     * @param gazTable the gazTable to set
     */
    public void setGazTable(javax.swing.JTable gazTable) {
        this.gazTable = gazTable;
    }

    /**
     * @return the gazUseTable
     */
    public javax.swing.JTable getGazUseTable() {
        return gazUseTable;
    }

    /**
     * @param gazUseTable the gazUseTable to set
     */
    public void setGazUseTable(javax.swing.JTable gazUseTable) {
        this.gazUseTable = gazUseTable;
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    /**
     * @return the jLabel5
     */
    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    /**
     * @param jLabel5 the jLabel5 to set
     */
    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    /**
     * @return the jLabel6
     */
    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    /**
     * @param jLabel6 the jLabel6 to set
     */
    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    /**
     * @return the jLabel7
     */
    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    /**
     * @param jLabel7 the jLabel7 to set
     */
    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    /**
     * @return the jLabel8
     */
    public javax.swing.JLabel getjLabel8() {
        return jLabel8;
    }

    /**
     * @param jLabel8 the jLabel8 to set
     */
    public void setjLabel8(javax.swing.JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    /**
     * @return the jLabel9
     */
    public javax.swing.JLabel getjLabel9() {
        return jLabel9;
    }

    /**
     * @param jLabel9 the jLabel9 to set
     */
    public void setjLabel9(javax.swing.JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    /**
     * @return the jList1
     */
    public javax.swing.JList getjList1() {
        return jList1;
    }

    /**
     * @param jList1 the jList1 to set
     */
    public void setjList1(javax.swing.JList jList1) {
        this.jList1 = jList1;
    }

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the jScrollPane10
     */
    public javax.swing.JScrollPane getjScrollPane10() {
        return jScrollPane10;
    }

    /**
     * @param jScrollPane10 the jScrollPane10 to set
     */
    public void setjScrollPane10(javax.swing.JScrollPane jScrollPane10) {
        this.jScrollPane10 = jScrollPane10;
    }

    /**
     * @return the jScrollPane11
     */
    public javax.swing.JScrollPane getjScrollPane11() {
        return jScrollPane11;
    }

    /**
     * @param jScrollPane11 the jScrollPane11 to set
     */
    public void setjScrollPane11(javax.swing.JScrollPane jScrollPane11) {
        this.jScrollPane11 = jScrollPane11;
    }

    /**
     * @return the jScrollPane2
     */
    public javax.swing.JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    /**
     * @param jScrollPane2 the jScrollPane2 to set
     */
    public void setjScrollPane2(javax.swing.JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    /**
     * @return the jScrollPane3
     */
    public javax.swing.JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    /**
     * @param jScrollPane3 the jScrollPane3 to set
     */
    public void setjScrollPane3(javax.swing.JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    /**
     * @return the jScrollPane4
     */
    public javax.swing.JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    /**
     * @param jScrollPane4 the jScrollPane4 to set
     */
    public void setjScrollPane4(javax.swing.JScrollPane jScrollPane4) {
        this.jScrollPane4 = jScrollPane4;
    }

    /**
     * @return the jScrollPane5
     */
    public javax.swing.JScrollPane getjScrollPane5() {
        return jScrollPane5;
    }

    /**
     * @param jScrollPane5 the jScrollPane5 to set
     */
    public void setjScrollPane5(javax.swing.JScrollPane jScrollPane5) {
        this.jScrollPane5 = jScrollPane5;
    }

    /**
     * @return the jScrollPane6
     */
    public javax.swing.JScrollPane getjScrollPane6() {
        return jScrollPane6;
    }

    /**
     * @param jScrollPane6 the jScrollPane6 to set
     */
    public void setjScrollPane6(javax.swing.JScrollPane jScrollPane6) {
        this.jScrollPane6 = jScrollPane6;
    }

    /**
     * @return the jScrollPane7
     */
    public javax.swing.JScrollPane getjScrollPane7() {
        return jScrollPane7;
    }

    /**
     * @param jScrollPane7 the jScrollPane7 to set
     */
    public void setjScrollPane7(javax.swing.JScrollPane jScrollPane7) {
        this.jScrollPane7 = jScrollPane7;
    }

    /**
     * @return the jScrollPane8
     */
    public javax.swing.JScrollPane getjScrollPane8() {
        return jScrollPane8;
    }

    /**
     * @param jScrollPane8 the jScrollPane8 to set
     */
    public void setjScrollPane8(javax.swing.JScrollPane jScrollPane8) {
        this.jScrollPane8 = jScrollPane8;
    }

    /**
     * @return the jScrollPane9
     */
    public javax.swing.JScrollPane getjScrollPane9() {
        return jScrollPane9;
    }

    /**
     * @param jScrollPane9 the jScrollPane9 to set
     */
    public void setjScrollPane9(javax.swing.JScrollPane jScrollPane9) {
        this.jScrollPane9 = jScrollPane9;
    }

    /**
     * @return the mixerTable
     */
    public javax.swing.JTable getMixerTable() {
        return mixerTable;
    }

    /**
     * @param mixerTable the mixerTable to set
     */
    public void setMixerTable(javax.swing.JTable mixerTable) {
        this.mixerTable = mixerTable;
    }

    /**
     * @return the mixerUseTable
     */
    public javax.swing.JTable getMixerUseTable() {
        return mixerUseTable;
    }

    /**
     * @param mixerUseTable the mixerUseTable to set
     */
    public void setMixerUseTable(javax.swing.JTable mixerUseTable) {
        this.mixerUseTable = mixerUseTable;
    }

    /**
     * @return the napaTable
     */
    public javax.swing.JTable getNapaTable() {
        return napaTable;
    }

    /**
     * @param napaTable the napaTable to set
     */
    public void setNapaTable(javax.swing.JTable napaTable) {
        this.napaTable = napaTable;
    }

    /**
     * @return the napaUseTable
     */
    public javax.swing.JTable getNapaUseTable() {
        return napaUseTable;
    }

    /**
     * @param napaUseTable the napaUseTable to set
     */
    public void setNapaUseTable(javax.swing.JTable napaUseTable) {
        this.napaUseTable = napaUseTable;
    }

    /**
     * @return the ovenTable1
     */
    public javax.swing.JTable getOvenTable1() {
        return ovenTable1;
    }

    /**
     * @param ovenTable1 the ovenTable1 to set
     */
    public void setOvenTable1(javax.swing.JTable ovenTable1) {
        this.ovenTable1 = ovenTable1;
    }

    /**
     * @return the ovenUseTable
     */
    public javax.swing.JTable getOvenUseTable() {
        return ovenUseTable;
    }

    /**
     * @param ovenUseTable the ovenUseTable to set
     */
    public void setOvenUseTable(javax.swing.JTable ovenUseTable) {
        this.ovenUseTable = ovenUseTable;
    }

    /**
     * @return the potTable
     */
    public javax.swing.JTable getPotTable() {
        return potTable;
    }

    /**
     * @param potTable the potTable to set
     */
    public void setPotTable(javax.swing.JTable potTable) {
        this.potTable = potTable;
    }

    /**
     * @return the potUseTable
     */
    public javax.swing.JTable getPotUseTable() {
        return potUseTable;
    }

    /**
     * @param potUseTable the potUseTable to set
     */
    public void setPotUseTable(javax.swing.JTable potUseTable) {
        this.potUseTable = potUseTable;
    }

}
