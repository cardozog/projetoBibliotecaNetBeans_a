package br.com.bg.bibliotecaBG.telas;

import br.com.bg.bibliotecaBG.controladores.ControladorTelaMenu;

/**
 *
 * @author Guilherme C
 * @since 20/09/2018
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {

        initComponents();
        controladorTelaMenu=new ControladorTelaMenu(jlaDiaSemana, jlaData, jlaHora);
        setLocationRelativeTo(null);
       // setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpaInformacao = new javax.swing.JPanel();
        jpaUsuarioLogado = new javax.swing.JPanel();
        jlaUsuarioLogado = new javax.swing.JLabel();
        jpaDataHora = new javax.swing.JPanel();
        jlaDiaSemana = new javax.swing.JLabel();
        jlaData = new javax.swing.JLabel();
        jlaHora = new javax.swing.JLabel();
        jpaLogoEmpresa = new javax.swing.JPanel();
        jlaLogoEmpresa = new javax.swing.JLabel();
        jdpTelaFilha = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiCadastrarUsuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto de Biblioteca - Basilides de Godoy JAVA JOVI");
        setResizable(false);

        jpaUsuarioLogado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuário Logado:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        jlaUsuarioLogado.setText("Usuário Logado");

        javax.swing.GroupLayout jpaUsuarioLogadoLayout = new javax.swing.GroupLayout(jpaUsuarioLogado);
        jpaUsuarioLogado.setLayout(jpaUsuarioLogadoLayout);
        jpaUsuarioLogadoLayout.setHorizontalGroup(
            jpaUsuarioLogadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaUsuarioLogadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlaUsuarioLogado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpaUsuarioLogadoLayout.setVerticalGroup(
            jpaUsuarioLogadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaUsuarioLogadoLayout.createSequentialGroup()
                .addComponent(jlaUsuarioLogado)
                .addGap(0, 81, Short.MAX_VALUE))
        );

        jpaDataHora.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data e Hora: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        jlaDiaSemana.setText("Dia ");

        jlaData.setText("Data");

        jlaHora.setText("Hora");

        javax.swing.GroupLayout jpaDataHoraLayout = new javax.swing.GroupLayout(jpaDataHora);
        jpaDataHora.setLayout(jpaDataHoraLayout);
        jpaDataHoraLayout.setHorizontalGroup(
            jpaDataHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaDataHoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpaDataHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlaDiaSemana)
                    .addComponent(jlaData)
                    .addComponent(jlaHora))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpaDataHoraLayout.setVerticalGroup(
            jpaDataHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaDataHoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlaDiaSemana)
                .addGap(18, 18, 18)
                .addComponent(jlaData)
                .addGap(18, 18, 18)
                .addComponent(jlaHora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpaLogoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Logo Empresa:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        jlaLogoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconbasilides.jpg"))); // NOI18N

        javax.swing.GroupLayout jpaLogoEmpresaLayout = new javax.swing.GroupLayout(jpaLogoEmpresa);
        jpaLogoEmpresa.setLayout(jpaLogoEmpresaLayout);
        jpaLogoEmpresaLayout.setHorizontalGroup(
            jpaLogoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaLogoEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlaLogoEmpresa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpaLogoEmpresaLayout.setVerticalGroup(
            jpaLogoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaLogoEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlaLogoEmpresa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpaInformacaoLayout = new javax.swing.GroupLayout(jpaInformacao);
        jpaInformacao.setLayout(jpaInformacaoLayout);
        jpaInformacaoLayout.setHorizontalGroup(
            jpaInformacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaInformacaoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpaInformacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpaUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpaDataHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpaLogoEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpaInformacaoLayout.setVerticalGroup(
            jpaInformacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaInformacaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jpaUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpaDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpaLogoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jdpTelaFilha.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jdpTelaFilhaLayout = new javax.swing.GroupLayout(jdpTelaFilha);
        jdpTelaFilha.setLayout(jdpTelaFilhaLayout);
        jdpTelaFilhaLayout.setHorizontalGroup(
            jdpTelaFilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );
        jdpTelaFilhaLayout.setVerticalGroup(
            jdpTelaFilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastrar");

        jmiCadastrarUsuarios.setText("Cadastrar Usuários");
        jmiCadastrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCadastrarUsuarios);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpaInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdpTelaFilha))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaInformacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jdpTelaFilha)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCadastrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiCadastrarUsuariosActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpTelaFilha;
    private javax.swing.JLabel jlaData;
    private javax.swing.JLabel jlaDiaSemana;
    private javax.swing.JLabel jlaHora;
    private javax.swing.JLabel jlaLogoEmpresa;
    private javax.swing.JLabel jlaUsuarioLogado;
    private javax.swing.JMenuItem jmiCadastrarUsuarios;
    private javax.swing.JPanel jpaDataHora;
    private javax.swing.JPanel jpaInformacao;
    private javax.swing.JPanel jpaLogoEmpresa;
    private javax.swing.JPanel jpaUsuarioLogado;
    // End of variables declaration//GEN-END:variables
   private ControladorTelaMenu controladorTelaMenu;
}