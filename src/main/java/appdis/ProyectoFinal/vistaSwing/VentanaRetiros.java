package appdis.ProyectoFinal.vistaSwing;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.transaction.Transactional.TxType;

import ec.edu.ups.servicios.CajeroServiceSOAP;
import ec.edu.ups.servicios.Cuenta;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRetiros extends JInternalFrame {
	private JTextField textCuenta;
	private JTextField textCedula;
	private JTextField textNombres;
	private JTextField textApellidos;
	private JTextField textMonto;

	private static CajeroServiceSOAP port;

	private Cuenta cuentaDeposito;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRetiros frame = new VentanaRetiros(port);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void cargarCampos() {
		{
			System.out.println("Invoking obtenerDatosCuenta...");
			java.lang.String _obtenerDatosCuenta_arg0 = textCuenta.getText();
			ec.edu.ups.servicios.Cuenta _obtenerDatosCuenta__return = port.obtenerDatosCuenta(_obtenerDatosCuenta_arg0);
			System.out.println("obtenerDatosCuenta.result=" + _obtenerDatosCuenta__return);
			
			textNombres.setText(_obtenerDatosCuenta__return.getCliente().getPersona().getNombres());
			textApellidos.setText(_obtenerDatosCuenta__return.getCliente().getPersona().getApellidos());
			textCedula.setText(_obtenerDatosCuenta__return.getCliente().getPersona().getCedula());
			
			cuentaDeposito = _obtenerDatosCuenta__return;

		}
	}

	public void retirarDinero() {
		{
			System.out.println("Invoking retiro...");
			java.lang.String _retiro_arg0 = "Retiro";
			double _retiro_arg1 = Double.parseDouble(textMonto.getText());
			ec.edu.ups.servicios.Cuenta _retiro_arg2 = cuentaDeposito;
			java.lang.String _retiro__return = port.retiro(_retiro_arg0, _retiro_arg1, _retiro_arg2);
			System.out.println("retiro.result=" + _retiro__return);

		}
	}

	/**
	 * Create the frame.
	 * 
	 * @param port
	 */
	public VentanaRetiros(CajeroServiceSOAP port) {

		this.port = port;
		
		cuentaDeposito= new Cuenta();
		
		setTitle("Retiros");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 499, 449);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("# cuenta:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(63, 50, 81, 19);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Cedula:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(63, 106, 81, 16);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nombres:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(63, 177, 81, 19);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Apellidos:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(63, 239, 81, 19);
		getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Monto:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(63, 306, 62, 19);
		getContentPane().add(lblNewLabel_4);

		textCuenta = new JTextField();
		textCuenta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textCuenta.setBounds(187, 47, 116, 22);
		getContentPane().add(textCuenta);
		textCuenta.setColumns(10);

		textCedula = new JTextField();
		textCedula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textCedula.setBounds(187, 103, 116, 22);
		getContentPane().add(textCedula);
		textCedula.setColumns(10);

		textNombres = new JTextField();
		textNombres.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textNombres.setBounds(187, 174, 116, 22);
		getContentPane().add(textNombres);
		textNombres.setColumns(10);

		textApellidos = new JTextField();
		textApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textApellidos.setBounds(187, 236, 116, 22);
		getContentPane().add(textApellidos);
		textApellidos.setColumns(10);

		textMonto = new JTextField();
		textMonto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textMonto.setBounds(187, 303, 116, 22);
		getContentPane().add(textMonto);
		textMonto.setColumns(10);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(365, 46, 97, 25);
		getContentPane().add(btnBuscar);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(128, 359, 97, 25);
		getContentPane().add(btnGuardar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(257, 359, 97, 25);
		getContentPane().add(btnCancelar);

	}
}
