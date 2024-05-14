public class Peixe {
  
    private String tipo;
    
    public Peixe(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Peixe [tipo=" + tipo + "]";
    }
   
    public static void main(String[] args) {
        Peixe peixe = new Peixe("Tilápia");
        System.out.println(peixe); 
        peixe.setTipo("Salmão");
        System.out.println("Novo tipo de peixe: " + peixe.getTipo());
    }
}
