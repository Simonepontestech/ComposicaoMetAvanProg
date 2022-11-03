package TedComposicaoMetAvanProg;

import java.util.Arrays;
import java.util.List;

public class HoraDaCompra {
    
    int hora;
    int minuto;
    String dia;
    List<String> dias = Arrays.asList( "SEGUNDA", "TERÇA", "QUARTA", "QUINTA", "SEXTA", "SABADO", "DOMINGO");

    public HoraDaCompra(int hora, int minuto, String dia) {
        this.hora = hora;
        this.minuto = minuto;
        this.dia = dia;
    }

    public double verificarPromocao() throws Exception{
        if((hora>=0 && hora<=24) && (minuto>=0 && minuto<=60) && dias.contains(dia.trim().toUpperCase())){
            if(hora>=20 || (dia.equalsIgnoreCase(dias.get(5)) || dia.equalsIgnoreCase(dias.get(6)))){
                return 0.1;
            }
            return 0;
        }else{
            throw new Exception("Hora, minuto ou dia inválido!");
        }
        
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public String getDia() {
        return this.dia;
    }
}
