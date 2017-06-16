/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.HeroeMovimiento;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

/**
 * Esta es la interfaz grafica del movimiento y el mapa.
 *
 * @author Jose Diaz & Brayan Herrera
 * @since 08/06/2017
 * @version 1.0
 */
public class Caronte extends javax.swing.JFrame {

    /**
     * Creates new form Caronte
     */
    public Caronte() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            setIconImage(new ImageIcon(getClass().getResource("../Recursos/kimera.png")).getImage());
        } catch (Exception e) {
        }
        
        iniciarComponentes();
    }

    /**
     * Este metodo de limita caundo ocurren las batallas. //
     */
//    public void eventoAleatorio() {
//        Random aleatorio = new Random();
//        int alazar = 1 + aleatorio.nextInt(100);
//        int numComparar = contador.getContadorPasos();
//
//        if (alazar == numComparar) {
//            new GraficaBatalla();
//        } else if (alazar < numComparar) {
//            contador.setContadorPasos(0);
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTablero = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(645, 650));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTablero.setLayout(new java.awt.GridLayout(10, 10));
        getContentPane().add(panelTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

        int teclaPresionada = evt.getKeyCode();

        switch (teclaPresionada) {
            case KeyEvent.VK_UP:
                if (posicionY > 0) {
                    if (posiciones[posicionY - 1][posicionX].getIcon() != imagenesTablero[1]) {
                        posiciones[posicionY][posicionX].setIcon(imagenesTablero[0]);
                        posicionY--;
                        posiciones[posicionY][posicionX].setIcon(imagenesTablero[2]);
                        repaint();
                        revalidate();
                        //En caso que la posicion no sea una baldosa 'vacia'
                    }
                }
                break;
            case KeyEvent.VK_DOWN:
                if (posicionY < posiciones.length - 1) {
                    if (posiciones[posicionY + 1][posicionX].getIcon() != imagenesTablero[1]) {
                        posiciones[posicionY][posicionX].setIcon(imagenesTablero[0]);
                        posicionY++;
                        posiciones[posicionY][posicionX].setIcon(imagenesTablero[2]);
                        repaint();
                        revalidate();
                        //En caso que la posicion no sea una baldosa 'vacia'
                    }

                }

                break;
            case KeyEvent.VK_RIGHT:
                if (posicionX < posiciones.length - 1) {
                    if (posiciones[posicionY][posicionX + 1].getIcon() != imagenesTablero[1]) {
                        posiciones[posicionY][posicionX].setIcon(imagenesTablero[0]);
                        posicionX++;
                        posiciones[posicionY][posicionX].setIcon(imagenesTablero[2]);
                        repaint();
                        revalidate();

                    }
                }
                break;
            case KeyEvent.VK_LEFT:
                if (posicionX > 0) {
                    if (posiciones[posicionY][posicionX - 1].getIcon() != imagenesTablero[1]) {
                        posiciones[posicionY][posicionX].setIcon(imagenesTablero[0]);
                        posicionX--;
                        posiciones[posicionY][posicionX].setIcon(imagenesTablero[2]);
                        repaint();
                        revalidate();

                        //En caso que la posicion no sea una baldosa 'vacia'
                    }
                }
                break;
            default:
                break;
        }

    }//GEN-LAST:event_formKeyPressed
    
    public void Batalla() {
        if (posiciones[posicionX][posicionY].equals(posiciones[3][0])) {
            GraficaBatalla Batalla = new GraficaBatalla();
            Batalla.setVisible(true);
        }
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
            java.util.logging.Logger.getLogger(Caronte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caronte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caronte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caronte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caronte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelTablero;
    // End of variables declaration//GEN-END:variables

    HeroeMovimiento contador = new HeroeMovimiento();
    JLabel[][] posiciones = new JLabel[10][10];
    ImageIcon[] imagenesTablero = new ImageIcon[6];
    int posicionY = 0;
    int posicionX = 0;

    private void iniciarComponentes() {

        imagenesTablero[0] = new ImageIcon(getClass().getResource("../Recursos/fondo.png"));
        imagenesTablero[1] = new ImageIcon(getClass().getResource("../Recursos/2.jpg"));
        imagenesTablero[2] = new ImageIcon(getClass().getResource("../Recursos/pj.jpg"));
        imagenesTablero[3] = new ImageIcon(getClass().getResource("../Recursos/fondo.png"));
        imagenesTablero[4] = new ImageIcon(getClass().getResource("../Recursos/fondo.png"));
        imagenesTablero[5] = new ImageIcon(getClass().getResource("../Recursos/fondo.png"));

        //<editor-fold defaultstate="collapsed" desc=" Armado del tablero de Juego ">
        posiciones[posicionY][posicionX] = new JLabel(imagenesTablero[0]);

        panelTablero.add(posiciones[0][0] = new JLabel(imagenesTablero[2]));
        panelTablero.add(posiciones[0][1] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[0][2] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[0][3] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[0][4] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[0][5] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[0][6] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[0][7] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[0][8] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[0][9] = new JLabel(imagenesTablero[0]));

        panelTablero.add(posiciones[1][0] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[1][1] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[1][2] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[1][3] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[1][4] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[1][5] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[1][6] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[1][7] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[1][8] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[1][9] = new JLabel(imagenesTablero[0]));

        panelTablero.add(posiciones[2][0] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[2][1] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[2][2] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[2][3] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[2][4] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[2][5] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[2][6] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[2][7] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[2][8] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[2][9] = new JLabel(imagenesTablero[0]));

        panelTablero.add(posiciones[3][0] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[3][1] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[3][2] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[3][3] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[3][4] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[3][5] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[3][6] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[3][7] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[3][8] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[3][9] = new JLabel(imagenesTablero[1]));

        panelTablero.add(posiciones[4][0] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[4][1] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[4][2] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[4][3] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[4][4] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[4][5] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[4][6] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[4][7] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[4][8] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[4][9] = new JLabel(imagenesTablero[1]));

        panelTablero.add(posiciones[5][0] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[5][1] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[5][2] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[5][3] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[5][4] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[5][5] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[5][6] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[5][7] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[5][8] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[5][9] = new JLabel(imagenesTablero[1]));

        panelTablero.add(posiciones[6][0] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[6][1] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[6][2] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[6][3] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[6][4] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[6][5] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[6][6] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[6][7] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[6][8] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[6][9] = new JLabel(imagenesTablero[1]));

        panelTablero.add(posiciones[7][0] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[7][1] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[7][2] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[7][3] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[7][4] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[7][5] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[7][6] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[7][7] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[7][8] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[7][9] = new JLabel(imagenesTablero[1]));

        panelTablero.add(posiciones[8][0] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[8][1] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[8][2] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[8][3] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[8][4] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[8][5] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[8][6] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[8][7] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[8][8] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[8][9] = new JLabel(imagenesTablero[1]));

        panelTablero.add(posiciones[9][0] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[9][1] = new JLabel(imagenesTablero[0]));
        panelTablero.add(posiciones[9][2] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[9][3] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[9][4] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[9][5] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[9][6] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[9][7] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[9][8] = new JLabel(imagenesTablero[1]));
        panelTablero.add(posiciones[9][9] = new JLabel(imagenesTablero[1]));
        //</editor-fold>
    }

}
