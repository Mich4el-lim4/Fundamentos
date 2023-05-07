package baytebank2Cliente;

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    
    public Conta(int agencia, int numero) {
    	
    	Conta.total++;
    	
    	if(agencia >= 0 && numero >= 0) {
    		this.agencia = agencia;
    		this.numero = numero;
    		System.out.println("Account created successfully");
    	} else {
    		System.out.println("Incompatible number");
    	}
    	
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
        	System.out.println();
        	System.out.println("Valor insuficiente");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saca(valor)) {
            //this.saldo -= valor;
            destino.deposita(valor);
            System.out.println();
            System.out.println("Transferencia realizada");
            System.out.println("valor de " + valor);
            return true;
        }
        return false;
    }

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
    
}