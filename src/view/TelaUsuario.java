/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UsuarioDAO;
import javax.swing.JOptionPane;
import model.UsuarioModel;

/**
 *
 * @author Geral
 */
public class TelaUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaUsuarioo
     */
    public TelaUsuario() {
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

        jTxtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCbxPerfil = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTxtFone = new javax.swing.JTextField();
        jBtnEditar = new javax.swing.JButton();
        jTxtLogin = new javax.swing.JTextField();
        jBtnAdicionar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCbxSenha = new javax.swing.JCheckBox();
        jBtnPesquisar = new javax.swing.JButton();
        jTxtSenha = new javax.swing.JPasswordField();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jTxtId.setEditable(false);

        jLabel1.setText("* Nome");

        jLabel2.setText("Fone");

        jCbxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "user" }));

        jLabel3.setText("* Login");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N

        jBtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/update.png"))); // NOI18N
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jBtnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/create.png"))); // NOI18N
        jBtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarActionPerformed(evt);
            }
        });

        jLabel4.setText("* Senha");

        jLabel6.setText("*  Id ");

        jLabel5.setText("* Perfil");

        jLabel7.setText("* Campos obrigatórios");

        jCbxSenha.setText("Alterar senha");

        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCbxSenha)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtnPesquisar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                            .addComponent(jLabel7))
                        .addComponent(jTxtNome)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTxtFone, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addComponent(jTxtSenha))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCbxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTxtLogin)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jBtnPesquisar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jCbxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jCbxSenha)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnAdicionar)
                    .addComponent(jBtnEditar)
                    .addComponent(jButton1))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarActionPerformed
        UsuarioModel um = new UsuarioModel();
        
        um.setLogin(jTxtLogin.getText());
        um.setSenha(jTxtSenha.getText());
        um.setUsuario(jTxtNome.getText());
        um.setFone(jTxtFone.getText());
        um.setPerfil(jCbxPerfil.getSelectedItem().toString());

        if (jTxtNome.getText().isEmpty() || jTxtSenha.getPassword().length == 0 || jTxtLogin.getText().isEmpty() || jCbxPerfil.getSelectedItem().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
        } else {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.adicionarUsuario(um);
            
        }
    }//GEN-LAST:event_jBtnAdicionarActionPerformed

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        UsuarioModel obj = new UsuarioModel();

        obj.setUsuario(jTxtNome.getText());
        obj.setFone(jTxtFone.getText());
        obj.setLogin(jTxtLogin.getText());
        obj.setPerfil(jCbxPerfil.getSelectedItem().toString());
        String captura = new String(jTxtSenha.getPassword());
        obj.setSenha(captura);
        obj.setIdUser(Integer.parseInt(jTxtId.getText()));
        
        if ((jTxtNome.getText().isEmpty()) || (jTxtSenha.getPassword().length == 0) || (jTxtLogin.getText().isEmpty()) || jCbxPerfil.getSelectedItem().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
        } else {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.editarUsuario(obj);
        }
      
            /*
        if (jCbxSenha.isSelected()) {
            usuarioDAO.editarUsuarioSenha(obj);
        } else {
            usuarioDAO.editarUsuario(obj);
        }

        }
*/
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        String nome = "%" + jTxtNome.getText() + "%";
        UsuarioModel obj = new UsuarioModel();
        UsuarioDAO dao = new UsuarioDAO();

        obj = dao.consultaUsuario(nome);

        if (obj.getUsuario() != null) {
            //Exibi os dados do obj nos campos de texto
            jTxtId.setText(String.valueOf(obj.getIdUser()));
            jTxtNome.setText(obj.getUsuario());
            jTxtFone.setText(obj.getFone());
            jTxtLogin.setText(obj.getLogin());
            jTxtSenha.setText(obj.getSenha());
            jCbxPerfil.setSelectedItem(obj.getPerfil());
        } else {

            jTxtId.setEnabled(false);
            jBtnPesquisar.setEnabled(true);
            jBtnAdicionar.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Usuário não encontrado");
        }
    }//GEN-LAST:event_jBtnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdicionar;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCbxPerfil;
    private javax.swing.JCheckBox jCbxSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTxtFone;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtLogin;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JPasswordField jTxtSenha;
    // End of variables declaration//GEN-END:variables
}
