package Tema3.Strings;
class Calculadora{
    public static void main(String[] args) {
        String linea;

        linea = Utilidades.leerCadena("-->");

        while(!esFin(linea)){
            if(esOperacionValida(linea)){
                System.out.println(calcularResultado(linea));
            }else{
                System.out.println("Operación inválida");
            }
            linea = Utilidades.leerCadena("-->");
        }
    }

    private static double calcularResultado(String linea) {
        String [] elementos = Utilidades.dividirEnPalabras(linea);
        double resultado = 0.0;

        double op1 = Double.parseDouble(elementos[0]);
        double op2 = Double.parseDouble(elementos[2]);

        switch(elementos[1]){
            case "+":
                resultado = op1 + op2;
                break;
            case "-":
                resultado = op1 - op2;
                break;
            case "x":
            case "X":
                resultado = op1 * op2;
                break;
            case "/":
                resultado = op1 / op2;
                break;
            default:
        }

        return resultado;
    }

    public static boolean esOperacionValida(String linea) {
        String [] elementos = Utilidades.dividirEnPalabras(linea);

        if (elementos.length == 3){
            if (isDouble(elementos[0]) &&
                isOperator(elementos[1]) &&
                isDouble(elementos[2])){
                    return true;

            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static boolean isOperator(String operator) {
        switch(operator){
            case "+":
            case "-":
            case "x":
            case "X":
            case "/":
                return true;
            default:
                return false;
        }
    }

    public static boolean esFin(String linea) {
        //Fin, fin, FiN, FIN...
        String minusculas = linea.toLowerCase();
        if(minusculas.equals("fin")){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException error) {
            return false;
        }
    }
} 