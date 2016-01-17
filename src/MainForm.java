
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.*;

/**
 *
 * @author Kamildo
 */
public class MainForm extends javax.swing.JFrame {

     Pole [][] planszagraccza=new Pole[22][14];
      Pole [][] planszaprzeciwnika=new Pole[22][14];
    LinkedList  statkigracza=new LinkedList<Statek>();
    LinkedList statkiprzeciwnika=new LinkedList<Statek>();
    Statek statek_do_rozstawienia;
    int wielkoscpola=35;
    boolean fazagry=false;
    boolean pierszepolewybrane=false;
    Random rand =new Random();
    Graphics grafika;
    Graphics grafika2;
    Graphics grafika3;
    int licznikrozstawienia=0;
    int pierwszepole_x;
    int pierwszepole_y;
    boolean lewo_dostepne=false;
     boolean dol_dostepne=false;
    boolean prawo_dostepne=false;
    boolean gora_dostepne=false;
    
    Statek pustysamolot=new Statek((byte)3,(byte)0);
    public void utworzplansze(){
        
    for(byte i=0;i<22;i++){
        for(byte j=0;j<14;j++)
        {
        planszaprzeciwnika[i][j]=new Pole(i,j);
        }
        }
    }
    
    
    public MainForm() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu_panel = new javax.swing.JPanel();
        Nowa_gra_button = new javax.swing.JButton();
        Wczytaj_button = new javax.swing.JButton();
        Zapisz_button = new javax.swing.JButton();
        panel_wybor_statkow = new javax.swing.JPanel();
        morskie1 = new javax.swing.JComboBox();
        morskie2 = new javax.swing.JComboBox();
        morskie3 = new javax.swing.JComboBox();
        morskie4 = new javax.swing.JComboBox();
        ladowe3 = new javax.swing.JComboBox();
        ladowe2 = new javax.swing.JComboBox();
        ladowe4 = new javax.swing.JComboBox();
        samoloty = new javax.swing.JComboBox();
        Zatwierdz_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        errorlabel = new javax.swing.JLabel();
        panel_gracza = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        panel_przeciwnika = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Panel_statki = new javax.swing.JPanel();
        Losuj_button = new javax.swing.JButton();
        Label_instrukcje = new javax.swing.JLabel();
        Label_pomoc = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1680, 1050));

        Menu_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Menu_panel.setPreferredSize(new java.awt.Dimension(200, 425));

        Nowa_gra_button.setText("Nowa gra");
        Nowa_gra_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nowa_gra_buttonActionPerformed(evt);
            }
        });

        Wczytaj_button.setText("Wczytaj");

        Zapisz_button.setText("Zapisz");

        javax.swing.GroupLayout Menu_panelLayout = new javax.swing.GroupLayout(Menu_panel);
        Menu_panel.setLayout(Menu_panelLayout);
        Menu_panelLayout.setHorizontalGroup(
            Menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_panelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(Menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Zapisz_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Wczytaj_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nowa_gra_button, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))
                .addContainerGap())
        );
        Menu_panelLayout.setVerticalGroup(
            Menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nowa_gra_button, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Wczytaj_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Zapisz_button, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        panel_wybor_statkow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_wybor_statkow.setEnabled(false);
        panel_wybor_statkow.setVisible(false);

        morskie1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3","4" }));

        morskie2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3","4" }));

        morskie3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3","4" }));

        morskie4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3","4" }));

        ladowe3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ladowe2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2","3" }));

        ladowe4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1" }));

        samoloty.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3","4" }));

        Zatwierdz_button.setText("Zatwierdz");
        Zatwierdz_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Zatwierdz_buttonActionPerformed(evt);
            }
        });

        jLabel1.setText("Morskie");

        jLabel2.setText("Lądowe");

        jLabel3.setText("Samoloty");

        jLabel4.setText("1 elementowe");

        jLabel5.setText("2 elementowe");

        jLabel6.setText("3 elementowe");

        jLabel7.setText("4 elementowe");

        errorlabel.setMaximumSize(new java.awt.Dimension(50, 50));
        errorlabel.setMinimumSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout panel_wybor_statkowLayout = new javax.swing.GroupLayout(panel_wybor_statkow);
        panel_wybor_statkow.setLayout(panel_wybor_statkowLayout);
        panel_wybor_statkowLayout.setHorizontalGroup(
            panel_wybor_statkowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_wybor_statkowLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Zatwierdz_button, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(panel_wybor_statkowLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panel_wybor_statkowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_wybor_statkowLayout.createSequentialGroup()
                        .addComponent(errorlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_wybor_statkowLayout.createSequentialGroup()
                        .addGroup(panel_wybor_statkowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_wybor_statkowLayout.createSequentialGroup()
                                .addComponent(morskie3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ladowe3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_wybor_statkowLayout.createSequentialGroup()
                                .addGroup(panel_wybor_statkowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_wybor_statkowLayout.createSequentialGroup()
                                        .addGroup(panel_wybor_statkowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_wybor_statkowLayout.createSequentialGroup()
                                                .addGroup(panel_wybor_statkowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(morskie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(morskie2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26)
                                                .addGroup(panel_wybor_statkowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel6))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE))
                                    .addGroup(panel_wybor_statkowLayout.createSequentialGroup()
                                        .addComponent(morskie4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(panel_wybor_statkowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ladowe2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ladowe4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(panel_wybor_statkowLayout.createSequentialGroup()
                                .addGroup(panel_wybor_statkowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(samoloty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(62, 62, 62))))
        );
        panel_wybor_statkowLayout.setVerticalGroup(
            panel_wybor_statkowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_wybor_statkowLayout.createSequentialGroup()
                .addGroup(panel_wybor_statkowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_wybor_statkowLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1))
                    .addGroup(panel_wybor_statkowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_wybor_statkowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(morskie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panel_wybor_statkowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(morskie2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ladowe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(panel_wybor_statkowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(morskie3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ladowe3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_wybor_statkowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(morskie4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ladowe4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(samoloty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(errorlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Zatwierdz_button, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        panel_gracza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_gracza.setPreferredSize(new java.awt.Dimension(616, 392));
        panel_gracza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_graczaMousePressed(evt);
            }
        });
        panel_gracza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panel_graczaKeyPressed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mapa.png"))); // NOI18N
        jLabel9.setText("jLabel8");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_graczaLayout = new javax.swing.GroupLayout(panel_gracza);
        panel_gracza.setLayout(panel_graczaLayout);
        panel_graczaLayout.setHorizontalGroup(
            panel_graczaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_graczaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_graczaLayout.setVerticalGroup(
            panel_graczaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_graczaLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_przeciwnika.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_przeciwnika.setPreferredSize(new java.awt.Dimension(616, 392));
        panel_przeciwnika.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_przeciwnikaMousePressed(evt);
            }
        });
        panel_przeciwnika.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panel_przeciwnikaKeyPressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mapa.png"))); // NOI18N
        jLabel10.setText("jLabel8");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_przeciwnikaLayout = new javax.swing.GroupLayout(panel_przeciwnika);
        panel_przeciwnika.setLayout(panel_przeciwnikaLayout);
        panel_przeciwnikaLayout.setHorizontalGroup(
            panel_przeciwnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_przeciwnikaLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_przeciwnikaLayout.setVerticalGroup(
            panel_przeciwnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_przeciwnikaLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Panel_statki.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_statki.setMaximumSize(new java.awt.Dimension(350, 950));
        Panel_statki.setMinimumSize(new java.awt.Dimension(350, 950));
        Panel_statki.setPreferredSize(new java.awt.Dimension(350, 950));

        Losuj_button.setText("Losuj");
        Losuj_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Losuj_buttonActionPerformed(evt);
            }
        });

        Label_instrukcje.setText(" ");

        jButton1.setText("odswiez");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_statkiLayout = new javax.swing.GroupLayout(Panel_statki);
        Panel_statki.setLayout(Panel_statkiLayout);
        Panel_statkiLayout.setHorizontalGroup(
            Panel_statkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_statkiLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(Panel_statkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_statkiLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(65, 65, 65)
                        .addComponent(Losuj_button, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_statkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Label_pomoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label_instrukcje, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(Panel_statkiLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(106, 106, 106))
        );
        Panel_statkiLayout.setVerticalGroup(
            Panel_statkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_statkiLayout.createSequentialGroup()
                .addContainerGap(638, Short.MAX_VALUE)
                .addGroup(Panel_statkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(32, 32, 32)
                .addComponent(Label_instrukcje, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(Label_pomoc, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel_statkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Losuj_button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_gracza, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_przeciwnika, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(Panel_statki, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Menu_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_wybor_statkow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_przeciwnika, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_gracza, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Panel_statki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Menu_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel_wybor_statkow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(508, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Nowa_gra_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nowa_gra_buttonActionPerformed
       //grafika_start();
         panel_wybor_statkow.setEnabled(true);
 panel_wybor_statkow.setVisible(true);
 utworzplansze();
 ustaw_wlasciwosci_pol();
        
        
        
    }//GEN-LAST:event_Nowa_gra_buttonActionPerformed

    private void Zatwierdz_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Zatwierdz_buttonActionPerformed
        int licznik_max=0;
        statkigracza.clear();
        statkiprzeciwnika.clear();
        for(byte i=0;i<ladowe2.getSelectedIndex();i++)
        {
           statkigracza.add(new Statek((byte)2,(byte)2));
           statkiprzeciwnika.add(new Statek((byte)2,(byte)2));
           licznik_max++;
        }
            for(byte i=0;i<ladowe3.getSelectedIndex();i++)
        {
           statkigracza.add(new Statek((byte)2,(byte)3));
           statkiprzeciwnika.add(new Statek((byte)2,(byte)3));
           licznik_max++;
        }
                for(byte i=0;i<ladowe2.getSelectedIndex();i++)
        {
           statkigracza.add(new Statek((byte)2,(byte)4));
           statkiprzeciwnika.add(new Statek((byte)2,(byte)4));
           licznik_max++;
        }
            for(byte i=0;i<morskie1.getSelectedIndex();i++)
        {
           statkigracza.add(new Statek((byte)1,(byte)1));
           statkiprzeciwnika.add(new Statek((byte)1,(byte)1));
           licznik_max++;
        }
          for(byte i=0;i<morskie2.getSelectedIndex();i++)
        {
           statkigracza.add(new Statek((byte)1,(byte)2));
           statkiprzeciwnika.add(new Statek((byte)1,(byte)2));
           licznik_max++;
        }
          for(byte i=0;i<morskie3.getSelectedIndex();i++)
        {
           statkigracza.add(new Statek((byte)1,(byte)3));
           statkiprzeciwnika.add(new Statek((byte)1,(byte)3));
           licznik_max++;
        }
          for(byte i=0;i<morskie4.getSelectedIndex();i++)
        {
           statkigracza.add(new Statek((byte)1,(byte)4));
           statkiprzeciwnika.add(new Statek((byte)1,(byte)4));
           licznik_max++;
        }
          for(byte i=0;i<samoloty.getSelectedIndex();i++)
        {
           statkigracza.add(new Statek((byte)3,(byte)4));
           statkiprzeciwnika.add(new Statek((byte)3,(byte)4));
           licznik_max++;
        }
        
          if(licznik_max==0){
              errorlabel.setText("Za mało statków.");
           return;
          }
           if(licznik_max>12){
           errorlabel.setText("Za dużo statków.Wybierz mniej niż 12");
           return;
           }    
           else{errorlabel.setText("");}
                 
 panel_wybor_statkow.setEnabled(false);
 panel_wybor_statkow.setVisible(false);
 
 fazagry=false;

 
 
  statki();
   rozstawkomputer();
  komunikatrozstawienie();
  
    }//GEN-LAST:event_Zatwierdz_buttonActionPerformed
public void komunikatrozstawienie()
{
    if(licznikrozstawienia==statkigracza.size())
    {
        fazagry=true;
         Label_instrukcje.setText("faza gry statki komunikat");
    return;
    }
statek_do_rozstawienia= (Statek)statkigracza.get(licznikrozstawienia);
Label_instrukcje.setText("Rozstaw statek "+statek_do_rozstawienia.toString());
}

    public void rozstawienie_statkow_recznie(int x,int y){
        if(fazagry==true){return;}
        
        if(licznikrozstawienia>statkigracza.size()){
                Label_instrukcje.setText("faza gry statki r");
            fazagry=true;
            return;
        }
    lewo_dostepne=false;
    dol_dostepne=false;
    prawo_dostepne=false;
    gora_dostepne=false;
    
    statek_do_rozstawienia= (Statek)statkigracza.get(licznikrozstawienia);
    boolean czymozna=false;
    if(statek_do_rozstawienia.getwielkosc()==1)
            { czymozna=true;}
    if(czy_mozna_ustawic(statek_do_rozstawienia, x, y, true))
        for(int i=statek_do_rozstawienia.getwielkosc();i>1;i--)
        {
            
            
                if((sprawdzpozostalepola(x,y,true,-i+1,0)==true))
                {
                    lewo_dostepne=true;
                    czymozna=true;}
                if(sprawdzpozostalepola(x,y,true,i-1,0)==true)
                {
                    prawo_dostepne=true;
                    czymozna=true;}
                if(sprawdzpozostalepola(x,y,true,0,-i+1)==true)
                {
                    gora_dostepne=true;
                    czymozna=true;}
                if(sprawdzpozostalepola(x,y,true,0,i-1))
                {
                      dol_dostepne=true;
                    czymozna=true;}
      
        }
    
    if(czymozna==true){
    Graphics grafika3=panel_gracza.getGraphics();
    grafika3.setColor(Color.ORANGE);
    grafika3.fillRect(35*x+3, 35*y+3, 30, 30);
    Pole tmp=(Pole)planszagraccza[x][y];
    tmp.setZawartoscpola(statek_do_rozstawienia);
    pierszepolewybrane=true;
    
    pierwszepole_x=x;
    pierwszepole_y=y;
    komunikatrozstawienie();
    licznikrozstawienia++;
    if(statek_do_rozstawienia.getwielkosc()==1){pierszepolewybrane=false;
    komunikatrozstawienie();}
    }
    
    
    
    
   

}
public boolean sprawdzpozostalepola(int x,int y,boolean gracz,int kierunek_x,int kierunek_y){
    
int x2=x+kierunek_x;
int y2=y+kierunek_y;
if(x2<0||y2<0||x2>21||y2>13)
    {return false;}
else{
return czy_mozna_ustawic(pustysamolot, x2, y2, true);

}
}
    private void panel_graczaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_graczaMousePressed
 
        
    }//GEN-LAST:event_panel_graczaMousePressed

    private void panel_graczaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panel_graczaKeyPressed
      
    }//GEN-LAST:event_panel_graczaKeyPressed

    private void panel_przeciwnikaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_przeciwnikaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_przeciwnikaMousePressed

    private void panel_przeciwnikaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panel_przeciwnikaKeyPressed
      // TODO add your handling code here:
    }//GEN-LAST:event_panel_przeciwnikaKeyPressed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
      if(fazagry){
        int x=evt.getX();
        int y=evt.getY();
        x-=(x%35);
        y-=(y%35);
        if(planszaprzeciwnika[x/35][y/35].zawartoscpola!=null)
        {
             rysuj_strzal(x,y,true);
        }
        rysuj_strzal(x,y,false);
      }
    }//GEN-LAST:event_jLabel10MouseClicked
public void rozstawlosowo(boolean gracz){
if(gracz=true)
{
    for (int i=0;i<statkigracza.size();i++)
    {
     int x=rand.nextInt(21);
    int y=rand.nextInt(13);
     boolean czymozna=false;
      boolean q=false;
        while(q==false&&czymozna==false)
        {
             q=czy_mozna_ustawic((Statek)(statkigracza.get(i)),x,y,true);
            System.out.println((statkigracza.get(i).toString())+q);
            czymozna=false;
    x=rand.nextInt(21);
    y=rand.nextInt(13);
    lewo_dostepne=false;
    dol_dostepne=false;
    prawo_dostepne=false;
    gora_dostepne=false;
     for(int j=statek_do_rozstawienia.getwielkosc();i>1;i--)
        {
       if((sprawdzpozostalepola(x,y,true,-j+1,0)==true))
                {
                    lewo_dostepne=true;
                    czymozna=true;}
                if(sprawdzpozostalepola(x,y,true,j-1,0)==true)
                {
                    prawo_dostepne=true;
                    czymozna=true;}
                if(sprawdzpozostalepola(x,y,true,0,-j+1)==true)
                {
                    gora_dostepne=true;
                    czymozna=true;}
                if(sprawdzpozostalepola(x,y,true,0,j-1))
                {
                      dol_dostepne=true;
                    czymozna=true;}
                System.out.println(czymozna);
        }
        }
        Label_pomoc.setText("x: "+x+"y: "+y);
         Statek ustawiany= (Statek)statkigracza.get(i);
        if(prawo_dostepne==true){
            for(int a=x;i<x+ ustawiany.getwielkosc();a++)
            {
            planszagraccza[i][y].setZawartoscpola(ustawiany);
            }
        } 
         if(lewo_dostepne==true){
            for(int a=x;i<x- ustawiany.getwielkosc();a--)
            {
            planszagraccza[i][y].setZawartoscpola(ustawiany);
            }
        } 
         if(gora_dostepne==true){
            for(int a=y;i<y- ustawiany.getwielkosc();a--)
            {
            planszagraccza[x][i].setZawartoscpola(ustawiany);
        }
        }
             if(dol_dostepne==true){
            for(int a=y;i<y+ ustawiany.getwielkosc();a++)
            {    
                    planszagraccza[x][i].setZawartoscpola(ustawiany);
            }
            System.out.println(planszagraccza.toString());
        }
     }
}
else{}
    }
public void rozstawkomputer(){
   boolean gracz=false;
for (int i=0;i<statkiprzeciwnika.size();i++)
    {
    Statek rozstawiany=(Statek)statkiprzeciwnika.get(i);
    if(rozstawiany.getRodzaj()==1){
            int x=rand.nextInt(15)+6;
            int y=rand.nextInt(11)+1;
            System.out.println(x+" "+y);
            for(int x1=x;x1<x+rozstawiany.getwielkosc();x1++)
            {
            planszaprzeciwnika[x1][y].setZawartoscpola(rozstawiany);
            }
    }
    if(rozstawiany.getRodzaj()==2){
        int x=0;
        int y=4;
        while(planszaprzeciwnika[x][y].jest_ladem==false){
            x=rand.nextInt(3)+1;
             y=rand.nextInt(3);
        }
            for(int x1=x;x1<x+rozstawiany.getwielkosc();x1++)
            {
            planszaprzeciwnika[x1][y].setZawartoscpola(rozstawiany);
            }
    }
    }
    
}
public boolean sprawdz_sasiadujacepola_statki(int x,int y,boolean gracz,boolean dla_morskiego){
int test_x=x-1;
int test_y=y-1;
if(test_x>0&&test_y>0){
        if(gracz){
                if(planszagraccza[test_x][test_y].czy_jest_statek()==true)
                    return false;
                if(dla_morskiego){
                 if(planszagraccza[test_x][test_y].jest_ladem==true)
                    return false;
                }
                }
        else {
                if(planszaprzeciwnika[test_x][test_y].czy_jest_statek()==true)
                    return false;
                if(dla_morskiego){
                  if(planszaprzeciwnika[test_x][test_y].jest_ladem==true)
                    return false;
                }
            }
        }
 test_x=x-1;
 test_y=y;
if(test_x>0){
        if(gracz){
                if(planszagraccza[test_x][test_y].czy_jest_statek()==true)
                    return false;
                
        if(dla_morskiego){
                  if(planszagraccza[test_x][test_y].jest_ladem==true)
                    return false;
                }
        }
        else {
                if(planszaprzeciwnika[test_x][test_y].czy_jest_statek()==true)
                    return false;
                 if(dla_morskiego){
                  if(planszaprzeciwnika[test_x][test_y].jest_ladem==true)
                    return false;
                }
            }
        }
test_x=x-1;
test_y=y+1;
if(test_x>0&&test_y<14){
        if(gracz){
                if(planszagraccza[test_x][test_y].czy_jest_statek()==true)
                    return false;
                
        if(dla_morskiego){
                  if(planszagraccza[test_x][test_y].jest_ladem==true)
                    return false;
                }
        }
        else {
                if(planszaprzeciwnika[test_x][test_y].czy_jest_statek()==true)
                    return false;
                 if(dla_morskiego){
                  if(planszaprzeciwnika[test_x][test_y].jest_ladem==true)
                    return false;
                }
            }
        }
test_x=x;
 test_y=y+1;
if(test_x>0&&test_y<14){
        if(gracz){
                if(planszagraccza[test_x][test_y].czy_jest_statek()==true)
                    return false;
                
        if(dla_morskiego){
                  if(planszagraccza[test_x][test_y].jest_ladem==true)
                    return false;
                }
        }
        else {
                if(planszaprzeciwnika[test_x][test_y].czy_jest_statek()==true)
                    return false;
                 if(dla_morskiego){
                  if(planszaprzeciwnika[test_x][test_y].jest_ladem==true)
                    return false;
                }
            }
        }
test_x=x+1;
test_y=y+1;
if(test_x<22&&test_y<14){
        if(gracz){
                if(planszagraccza[test_x][test_y].czy_jest_statek()==true)
                    return false;
                
        if(dla_morskiego){
                  if(planszagraccza[test_x][test_y].jest_ladem==true)
                    return false;
                }
        }
        else {
                if(planszaprzeciwnika[test_x][test_y].czy_jest_statek()==true)
                    return false;
                 if(dla_morskiego){
                  if(planszaprzeciwnika[test_x][test_y].jest_ladem==true)
                    return false;
                }
            }
        }
test_x=x+1;
 test_y=y;
if(test_x<22){
        if(gracz){
                if(planszagraccza[test_x][test_y].czy_jest_statek()==true)
                    return false;
                
        if(dla_morskiego){
                  if(planszagraccza[test_x][test_y].jest_ladem==true)
                    return false;
                }
        }
        else {
                if(planszaprzeciwnika[test_x][test_y].czy_jest_statek()==true)
                    return false;
                 if(dla_morskiego){
                  if(planszaprzeciwnika[test_x][test_y].jest_ladem==true)
                    return false;
                }
            }
        }
 test_x=x+1;
 test_y=y-1;
if(test_x<22&&test_y>0){
        if(gracz){
                if(planszagraccza[test_x][test_y].czy_jest_statek()==true)
                    return false;
                
        if(dla_morskiego){
                  if(planszagraccza[test_x][test_y].jest_ladem==true)
                    return false;
                }
        }
        else {
                if(planszaprzeciwnika[test_x][test_y].czy_jest_statek()==true)
                    return false;
                 if(dla_morskiego){
                  if(planszaprzeciwnika[test_x][test_y].jest_ladem==true)
                    return false;
                }
            }
        }
test_x=x;
test_y=y-1;
if(test_y>0){
        if(gracz){
                if(planszagraccza[test_x][test_y].czy_jest_statek()==true)
                    return false;
                
        if(dla_morskiego){
                  if(planszagraccza[test_x][test_y].jest_ladem==true)
                    return false;
                }
        }
        else {
                if(planszaprzeciwnika[test_x][test_y].czy_jest_statek()==true)
                    return false;
                 if(dla_morskiego){
                  if(planszaprzeciwnika[test_x][test_y].jest_ladem==true)
                    return false;
                }
            }
        }
 
return true;
}
public boolean czy_mozna_ustawic(Statek statek,int x ,int y,boolean gracz){
    if(gracz){
    if(statek.getRodzaj()==2){//2-ladowy
        if(planszagraccza[x][y].jest_ladem==false||planszagraccza[x][y].zawartoscpola!=null||sprawdz_sasiadujacepola_statki(x, y, gracz, false)==false){
            System.out.println("nie można ustawić lad");
            return false;
            }
    }
     else if(statek.getRodzaj()==1)//morski
    {if(planszagraccza[x][y].jest_ladem==true|planszagraccza[x][y].zawartoscpola!=null||sprawdz_sasiadujacepola_statki(x, y, gracz, true)==false){
            return false;
            }
     }
     else if(statek.getRodzaj()==3)
     {
     if(planszagraccza[x][y].zawartoscpola!=null||sprawdz_sasiadujacepola_statki(x, y, gracz, false)==false)
         return false;
     }
    }
    
    
return true;
}
    private void Losuj_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Losuj_buttonActionPerformed
        rozstawlosowo(true);//gracz
    }//GEN-LAST:event_Losuj_buttonActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
      //ustawianie_statkow
       //  System.out.println(fazagry);
       if(fazagry==true){
           Label_pomoc.setText("faza gry-nie można ustawiac statkow");
           return;
       }
        int x=evt.getX();
        int y=evt.getY();
        x-=(x%35);
        x=x/35;
        y-=(y%35);
        y=y/35;
         jLabel11.setText("x: "+x+" y: "+y);
        if(pierszepolewybrane==false){
          rozstawienie_statkow_recznie(x, y);
        }
        else 
        {
            jLabel8.setText("drugie pole"+x+"  "+y);
           pierszepolewybrane= rysuj_statek(x,y);
   
            if(licznikrozstawienia==statkigracza.size())
    {
        fazagry=true;
        Label_instrukcje.setText("faza gry");
    }
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        odswiez();
    }//GEN-LAST:event_jButton1ActionPerformed
public void odswiez(){
    Graphics grafika3=panel_gracza.getGraphics();
grafika3.setColor(Color.ORANGE);
for(byte i=0;i<22;i++){
        for(byte j=0;j<14;j++)
        {
       Pole tmp= planszagraccza[i][j];
       if(tmp.zawartoscpola!=null){
       grafika3.fillRect(i*35+3, j*35+3, 30, 30);
       }
        }
        }

}
public boolean rysuj_statek(int x2,int y2){
   // System.out.println("pierwsze pole: "+pierwszepole_x +"  "+pierwszepole_y);
    int wielkosc=statek_do_rozstawienia.getwielkosc()-1;
    if((gora_dostepne&&y2-pierwszepole_y==wielkosc)||(dol_dostepne&&pierwszepole_y-y2==wielkosc)||(prawo_dostepne&&x2-pierwszepole_x==wielkosc)||(lewo_dostepne&&pierwszepole_x-x2==wielkosc))
    {
        Label_pomoc.setText("ok");
Graphics grafika3=panel_gracza.getGraphics();
grafika3.setColor(Color.ORANGE);
if(pierwszepole_x>x2)
{
    for (int i=x2;i<=pierwszepole_x;i++)
    {
    grafika3.fillRect(i*35+3, y2*35+3, 30, 30);
    Pole tmp=(Pole)planszagraccza[i][y2];
    System.out.println(i+" "+y2);
    tmp.setZawartoscpola(statek_do_rozstawienia);
    }
}
else if(pierwszepole_y>y2)    
{
    for (int i=y2;i<=pierwszepole_y;i++)
    {
    grafika3.fillRect(x2*35+3, i*35+3, 30, 30);
    Pole tmp=(Pole)planszagraccza[x2][i];
     System.out.println(x2+" "+i);
    tmp.setZawartoscpola(statek_do_rozstawienia);
    }
}
 else if(pierwszepole_x<x2) 
 {
     for (int i=x2;i>=pierwszepole_x;i--)
    {
    grafika3.fillRect(i*35+3, y2*35+3, 30, 30);
     Pole tmp=(Pole)planszagraccza[i][y2];
      System.out.println(i+" "+y2);
    tmp.setZawartoscpola(statek_do_rozstawienia);
    }
 }
 else if(pierwszepole_y<y2) 
 {

     for (int i=y2;i>=pierwszepole_y;i--)
    {
    grafika3.fillRect(x2*35+3, i*35+3, 30, 30);
     Pole tmp=(Pole)planszagraccza[y2][i];
      System.out.println(y2+" "+i);
    tmp.setZawartoscpola(statek_do_rozstawienia);
    }
 }
return false;
    }
    else{
        
        Label_pomoc.setText("wybierz inne pole drugie"+lewo_dostepne+prawo_dostepne+gora_dostepne+dol_dostepne);
    return true;
    }
}    
public void grafika_start() {

}
public void rysuj_strzal(int x,int y,boolean gracz) {
    if(gracz){
   Graphics grafika= panel_gracza.getGraphics();
   grafika.setColor(Color.red);
   grafika.drawRoundRect(x, y,35, 35, 5, 5);
    }
    else{    
    Graphics grafika= panel_przeciwnika.getGraphics();
    grafika.setColor(Color.red);
   grafika.drawRoundRect(x, y,35, 35, 5, 5);
    }
   
}
public void ustaw_wlasciwosci_pol(){

if(planszaprzeciwnika==null){return;}
planszaprzeciwnika[0][0].set_jest_ladem();
planszaprzeciwnika[0][1].set_jest_ladem();
planszaprzeciwnika[0][2].set_jest_ladem();
planszaprzeciwnika[1][0].set_jest_ladem();
planszaprzeciwnika[1][1].set_jest_ladem();
planszaprzeciwnika[1][2].set_jest_ladem();
planszaprzeciwnika[1][9].set_jest_ladem();
planszaprzeciwnika[1][10].set_jest_ladem();
planszaprzeciwnika[1][11].set_jest_ladem();
planszaprzeciwnika[1][12].set_jest_ladem();
planszaprzeciwnika[2][0].set_jest_ladem();
planszaprzeciwnika[2][1].set_jest_ladem();
planszaprzeciwnika[2][2].set_jest_ladem();
planszaprzeciwnika[2][9].set_jest_ladem();
planszaprzeciwnika[2][10].set_jest_ladem();
planszaprzeciwnika[2][11].set_jest_ladem();
planszaprzeciwnika[2][12].set_jest_ladem();
planszaprzeciwnika[3][0].set_jest_ladem();
planszaprzeciwnika[3][1].set_jest_ladem();
planszaprzeciwnika[3][2].set_jest_ladem();
planszaprzeciwnika[3][9].set_jest_ladem();
planszaprzeciwnika[3][10].set_jest_ladem();
planszaprzeciwnika[3][11].set_jest_ladem();
planszaprzeciwnika[3][12].set_jest_ladem();
planszaprzeciwnika[4][0].set_jest_ladem();
planszaprzeciwnika[4][1].set_jest_ladem();
planszaprzeciwnika[4][2].set_jest_ladem();
planszaprzeciwnika[4][9].set_jest_ladem();
planszaprzeciwnika[4][10].set_jest_ladem();
planszaprzeciwnika[4][11].set_jest_ladem();
planszaprzeciwnika[4][12].set_jest_ladem();
planszaprzeciwnika[5][0].set_jest_ladem();
planszaprzeciwnika[5][1].set_jest_ladem();
planszaprzeciwnika[5][2].set_jest_ladem();
planszaprzeciwnika[6][0].set_jest_ladem();
planszaprzeciwnika[6][1].set_jest_ladem();
planszaprzeciwnika[12][13].set_jest_ladem();
planszaprzeciwnika[13][13].set_jest_ladem();
planszaprzeciwnika[14][12].set_jest_ladem();
planszaprzeciwnika[14][13].set_jest_ladem();
planszaprzeciwnika[15][12].set_jest_ladem();
planszaprzeciwnika[15][13].set_jest_ladem();
planszaprzeciwnika[16][12].set_jest_ladem();
planszaprzeciwnika[16][13].set_jest_ladem();
planszaprzeciwnika[17][11].set_jest_ladem();
planszaprzeciwnika[17][12].set_jest_ladem();
planszaprzeciwnika[17][13].set_jest_ladem();
planszaprzeciwnika[18][9].set_jest_ladem();
planszaprzeciwnika[18][10].set_jest_ladem();
planszaprzeciwnika[18][11].set_jest_ladem();
planszaprzeciwnika[18][12].set_jest_ladem();
planszaprzeciwnika[18][13].set_jest_ladem();
planszaprzeciwnika[19][8].set_jest_ladem();
planszaprzeciwnika[19][9].set_jest_ladem();
planszaprzeciwnika[19][10].set_jest_ladem();
planszaprzeciwnika[19][11].set_jest_ladem();
planszaprzeciwnika[19][12].set_jest_ladem();
planszaprzeciwnika[19][13].set_jest_ladem();
planszaprzeciwnika[20][7].set_jest_ladem();
planszaprzeciwnika[20][8].set_jest_ladem();
planszaprzeciwnika[20][9].set_jest_ladem();
planszaprzeciwnika[20][10].set_jest_ladem();
planszaprzeciwnika[20][11].set_jest_ladem();
planszaprzeciwnika[20][12].set_jest_ladem();
planszaprzeciwnika[20][13].set_jest_ladem();
planszaprzeciwnika[21][7].set_jest_ladem();
planszaprzeciwnika[21][8].set_jest_ladem();
planszaprzeciwnika[21][9].set_jest_ladem();
planszaprzeciwnika[21][10].set_jest_ladem();
planszaprzeciwnika[21][11].set_jest_ladem();
planszaprzeciwnika[21][12].set_jest_ladem();
planszaprzeciwnika[21][13].set_jest_ladem();



planszagraccza=planszaprzeciwnika.clone();



}
public void statki(){
   
 Graphics grafika2= Panel_statki.getGraphics();
 grafika2.clearRect(2, 2, 440, 940);
 grafika2.setColor(Color.orange);
 int i=0;
 for (i=0;i<statkigracza.size();i++)
 {
          
     Statek obj=(Statek)statkigracza.get(i);
//     grafika2.drawRoundRect(40, 40+40*i, 20*obj.getwielkosc(), 20, 0, 0);
 grafika2.fillRoundRect(40, 30+40*i, 30*obj.getwielkosc(), 15, 0, 0);
 }
 grafika2.setColor(Color.RED);
 for (i=0;i<statkigracza.size();i++)
 {
     
     Statek obj=(Statek)statkiprzeciwnika.get(i);
//     grafika2.drawRoundRect(40, 40+40*i, 20*obj.getwielkosc(), 20, 0, 0);
 grafika2.fillRoundRect(240, 30+40*i, 30*obj.getwielkosc(), 15, 0, 0);
 }
 

}


    public static void main(String args[]) {
   
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_instrukcje;
    private javax.swing.JLabel Label_pomoc;
    private javax.swing.JButton Losuj_button;
    private javax.swing.JPanel Menu_panel;
    private javax.swing.JButton Nowa_gra_button;
    private javax.swing.JPanel Panel_statki;
    private javax.swing.JButton Wczytaj_button;
    private javax.swing.JButton Zapisz_button;
    private javax.swing.JButton Zatwierdz_button;
    private javax.swing.JLabel errorlabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox ladowe2;
    private javax.swing.JComboBox ladowe3;
    private javax.swing.JComboBox ladowe4;
    private javax.swing.JComboBox morskie1;
    private javax.swing.JComboBox morskie2;
    private javax.swing.JComboBox morskie3;
    private javax.swing.JComboBox morskie4;
    private javax.swing.JPanel panel_gracza;
    private javax.swing.JPanel panel_przeciwnika;
    private javax.swing.JPanel panel_wybor_statkow;
    private javax.swing.JComboBox samoloty;
    // End of variables declaration//GEN-END:variables
}
