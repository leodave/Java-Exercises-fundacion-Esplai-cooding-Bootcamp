public class RedOrBlack {
    public String climateScreen(double number){
        String answer = null;
        if(number < 10){
            if( number <= 5){
                answer = "Climas frios \nPolar";
            }else{
                answer = " Climas frios \nAlta Montaña";
            }
        }
        if(number >= 10 && number < 20){
            if( number >= 10 && number < 13.5 ) {
                answer = "Climas templados \nOceanico";
            }else if(number >= 13.5 && number < 16.5){
                answer = " Climas templados \nMediterraneano";
            }else{
                answer = " Climas templados \nCpntinental";
            }
        }
        if(number >= 20){
            if( number >= 20 && number < 23.5){
                answer = "Climas calidos \nEquatorial";
            }
            else if( number >= 23.5 && number < 26.5){
                answer = "Climas calidos \nTropical";
            }else{
                answer = "Climas calidos \nDesertico";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        RedOrBlack redOrBlack = new RedOrBlack();
        System.out.println(redOrBlack.climateScreen(25));
    }
}
