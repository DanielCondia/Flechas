public class Main {
    public static void main(String[] args) {
        char asterisco = '*';
        char[][] array = new char[10][10];
        int a = 5;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int sumaA = a++;
                int restA = a--;
                if(i == 0 && j == 5){
                    array[i][j] = asterisco;
                    sumaA = a;
                    restA = a;
                    break;
                }
                else if(i > 0){
                    if(i == 5){
                        array[i][j] = asterisco;
                    }
                    else{
                        array[i][restA] = asterisco;
                        array[i][sumaA] = asterisco;
                        break;
                    }
                }
            }
        }
        imprimirNumeros(array);
    }
    public static void imprimirNumeros(char[][] array){
        
    }

}