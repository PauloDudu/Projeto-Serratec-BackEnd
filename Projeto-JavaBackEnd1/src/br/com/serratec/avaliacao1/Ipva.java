package br.com.serratec.avaliacao1;

public class Ipva extends Veiculo {
	public double valorIpva;
	public double taxaLicenciamento;
	
	
	public Ipva(String modelo, String placa, String combustivel, double valorVeiculo,double taxaLicenciamento) {
		super(modelo, placa, combustivel, valorVeiculo);
		this.taxaLicenciamento = taxaLicenciamento;
	} 
	

	public double getValorIpva() {
		return valorIpva;
	}

	 public double getTaxaLicenciamento() {
	        return taxaLicenciamento;
	    }

	public void calcularIpva(){
        if(this.combustivel.equals("gás")){
        System.out.println("------------- CARRO ------------");
        System.out.println("Modelo: "+getModelo()+"\nPlaca: "+getPlaca()+"\nValor do veiculo: "+getValorVeiculo()+"\nCombustível: "+getCombustivel());
        System.out.println("Com o IPVA de:"+(this.valorIpva=(valorVeiculo*0.01))+" Mais taxa de licenciamento: "+this.taxaLicenciamento);
        System.out.println("Preco atribuido com a taxa: "+(this.valorIpva=(valorVeiculo*0.01)+this.taxaLicenciamento));
        System.out.println("\n");
    }
    else 
        
        if(this.combustivel.equals("flex")){
        System.out.println("------------- CARRO ------------");
        System.out.println("Modelo: "+getModelo()+"\nPlaca: "+getPlaca()+"\nValor do veiculo: "+getValorVeiculo()+"\nCombustível: "+getCombustivel());
        System.out.println("Com o IPVA de: "+(this.valorIpva=(valorVeiculo*0.01))+" Mais taxa de licenciamento: "+this.taxaLicenciamento);
        System.out.println("Preco atribuido com a taxa: "+(this.valorIpva=(valorVeiculo*0.03)+this.taxaLicenciamento));
        System.out.println("\n");
        }
        
    else if(this.combustivel.equals("gasolina")){
        System.out.println("------------- CARRO ------------");
        System.out.println("Modelo: "+getModelo()+"\nPlaca: "+getPlaca()+"\nValor do veiculo: "+getValorVeiculo()+"\nCombustível: "+getCombustivel());
        System.out.println("Com o IPVA de: "+(this.valorIpva=(valorVeiculo*0.01))+" Mais taxa de licenciamento: "+this.taxaLicenciamento);
        System.out.println("Preco atribuido com a taxa: "+(this.valorIpva=(valorVeiculo*0.04)+this.taxaLicenciamento));
        System.out.println("\n");
        }
    }



	
	
	

	
	
}
