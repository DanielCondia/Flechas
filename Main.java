public class Main {
    public static void main(String[] args) {
        char asterisco = '*';
        char[][] array = new char[11][11];
        int sum = 5;
        int rest = 5;
        for (int i = 0; i < array.length; i++) {
            if(i > 5){
                break;
            }
            ++sum;
            --rest;
            for (int j = 0; j < array.length; j++) {
                if(i == 0 && j == 5){
                    array[i][j] = asterisco;
                    break;
                }
                else if(i > 0){
                    if(i == 4){
                        array[i][j] = asterisco;
                    }
                    else if(j == rest && rest < array.length|| j == sum && sum < array.length){
                        array[i][rest] = asterisco;
                        array[i][sum] = asterisco;
                        break;
                    }
                }
            }
        }
        imprimirNumeros(array);
    }
    public static void imprimirNumeros(char[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" ");
                char temp = array[i][j];
                if(temp == '*'){
                    System.out.print(array[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}