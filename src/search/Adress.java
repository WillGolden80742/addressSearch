/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

/**
 *
 * @author William
 */
public class Adress extends javax.swing.JFrame {

    private String enderecoInicial = "Av.+Paulista,+São+Paulo+-+SP";
    private String enderecoFinal;
    private String[] values;
    private static String apiKey;
    private String mapHtml = "<center ><img style=\"margin:0;padding:0;-webkit-user-select: none;margin:none;background-color: hsl(0, 0%, 90%);transition: background-color 300ms;\" src=\"#img\"></center>";
    private boolean selectSizeInit = false;

    public Adress() {
        initComponents();
        setIconTop();
        setKeyAPI();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        setLocation(400, 200);
        setDefaulMap();
        size.setSelectedIndex(16);
    }

    private void setDefaulMap() {
        String path = new File("src/Images/cityBackground.png").getAbsoluteFile().toURI().toString();
        this.mapHtml = mapHtml.replace("#img", path);
        mapView.setText(mapHtml);

    }

    private void setKeyAPI() {
        File myObj = new File("apiKey.txt");
        Scanner myReader;
        String apiKey = "";
        try {
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                apiKey = myReader.nextLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Adress.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.apiKey = apiKey;
    }

    private void setIconTop() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/city.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        logradouro = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        referencia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        complemento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        search1 = new javax.swing.JButton();
        mapView = new javax.swing.JEditorPane();
        size = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("jButton1");

        setTitle("Endereço");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        logradouro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logradouro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        logradouro.setToolTipText("Endereço");
        logradouro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        logradouro.setCaretColor(new java.awt.Color(0, 0, 0));
        logradouro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                logradouroKeyReleased(evt);
            }
        });

        search.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        search.setText("PESQUISAR");
        search.setToolTipText("Pesquisar");
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        search.setContentAreaFilled(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        referencia.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        referencia.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        referencia.setToolTipText("Referência");
        referencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        referencia.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Endereço :");

        complemento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        complemento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        complemento.setToolTipText("Complemento");
        complemento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        complemento.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Compl : ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Ref : ");

        search1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        search1.setText("SALVAR");
        search1.setToolTipText("Salvar");
        search1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        search1.setContentAreaFilled(false);
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });

        mapView.setEditable(false);
        mapView.setContentType("text/html"); // NOI18N

        size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1x", "2x", "3x", "4x", "5x", "6x", "7x", "8x", "9x", "10x", "11x", "12x", "13x", "14x", "15x", "16x", "17x", "18x", "19x", "20x", "21x", "22x", "23x", "24x", "25x", "26x", "27x", "28x", "29x", "30x" }));
        size.setEnabled(false);
        size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(size, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))
                    .addComponent(mapView, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mapView, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logradouro, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(size, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        search();
    }//GEN-LAST:event_searchActionPerformed

    private void logradouroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logradouroKeyReleased
        if (evt.getKeyCode() == 10) {
            search();
        }
    }//GEN-LAST:event_logradouroKeyReleased

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeActionPerformed
        if (selectSizeInit) {
            new Thread(downloadMap).start();
        } else {
            selectSizeInit=true;
        }
    }//GEN-LAST:event_sizeActionPerformed

    private String endercoTratado() {
        String[] endereçoArray = logradouro.getText().split(" ");
        String endereco = "";
        for (String l : endereçoArray) {
            endereco += l + "%20";
        }
        return endereco;
    }

    private void search() {
        enderecoFinal = endercoTratado();
        new Thread(endereco).start();
        new Thread(downloadMap).start();
    }

    private final Runnable downloadMap = new Runnable() {
        @Override
        public void run() {
            String x = ((String) size.getSelectedItem()).toLowerCase().replace("x", "");
            mapHtml = "<center ><img style=\"padding:0;-webkit-user-select: none;margin:none;background-color: hsl(0, 0%, 90%);transition: background-color 300ms;\" src=\"#img\"></center>";
            String url = "https://maps.googleapis.com/maps/api/staticmap?size=512x256&maptype=roadmap&markers=size:mid%7Ccolor:red%7C" + endercoTratado() + "&zoom=" + x + "&size=512x256&maptype=roadmap&key=" + apiKey;
            mapHtml = mapHtml.replace("#img", url);
            System.out.println(mapHtml);
            mapView.setText(mapHtml);
            size.setEnabled(true);
            // faz o preload da imagem
        }
    };

    private final Runnable endereco = new Runnable() {
        @Override
        public void run() {
            String urlString = "https://maps.googleapis.com/maps/api/distancematrix/xml?origins=" + enderecoInicial + "&destinations=" + enderecoFinal + "&key=" + apiKey + "&mode=driving&language=pt-BR&sensor=false";
            System.out.println(urlString);
            try {

                URL urlGoogleDirService = new URL(urlString);
                HttpURLConnection urlGoogleDirCon = (HttpURLConnection) urlGoogleDirService.openConnection();
                urlGoogleDirCon.setAllowUserInteraction(false);
                urlGoogleDirCon.setDoInput(true);
                urlGoogleDirCon.setDoOutput(false);
                urlGoogleDirCon.setUseCaches(true);
                urlGoogleDirCon.setRequestMethod("GET");
                urlGoogleDirCon.connect();

                DocumentBuilderFactory factoryDir = DocumentBuilderFactory.newInstance();
                DocumentBuilder parserDirInfo = factoryDir.newDocumentBuilder();
                Document docDir = parserDirInfo.parse(urlGoogleDirCon.getInputStream());
                urlGoogleDirCon.disconnect();
                String resultado = docDir.getDocumentElement().getTextContent();
                String[] value = resultado.split("\n");
                values = new String[2];
                int i = 0;
                for (String s : value) {
                    System.out.println("Valores" + s);
                    if (i == 3) {
                        values[0] = s;
                    }
                    if (s.contains("km")) {
                        values[1] = s;
                    }
                    i++;
                }
                logradouro.setText(values[0]);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    };

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        new Adress().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField complemento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField logradouro;
    private javax.swing.JEditorPane mapView;
    private javax.swing.JTextField referencia;
    private javax.swing.JButton search;
    private javax.swing.JButton search1;
    private javax.swing.JComboBox<String> size;
    // End of variables declaration//GEN-END:variables
}
