/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bg.bibliotecaBG.controladores;

import br.com.bg.bibliotecaBG.telas.TelaCadastroUsuario;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

/**
 *
 * @author guilherme c
 */
public abstract class ControladorTela {
    private String mensagem;
    private JFrame telaPrincipal;
    private JDesktopPane jdpTelaCadastroCliente;
    private TelaCadastroUsuario telaCadastroCliente;
    
    public ControladorTela(JFrame telaPrincipal, JDesktopPane jdpTelaCadastroCliente){
        this.telaPrincipal = telaPrincipal;
        this.jdpTelaCadastroCliente = jdpTelaCadastroCliente;
    }
    public void exibirTelaCadastroCliente(){
        if (telaCadastroCliente == null){
            telaCadastroCliente = new TelaCadastroUsuario();
            jdpTelaCadastroCliente.add(telaCadastroCliente);
            telaCadastroCliente.setVisible(true);
        }
    }
}
