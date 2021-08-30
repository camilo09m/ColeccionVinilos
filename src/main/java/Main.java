public class Main {
    public static void main(String[] args) {
        String[][] vinilos =new String[100][3];
        agregarVinilos(vinilos,"Iron Maiden","Iron Maiden","1980");
        agregarVinilos(vinilos,"Iron Maiden","Killer","1981");
        agregarVinilos(vinilos,"Iron Maiden","The number of the beast","1982");
        agregarVinilos(vinilos,"AC-DC","Back in black","1980");
        agregarVinilos(vinilos,"AC-DC","Highway to Hell","1979");
        agregarVinilos(vinilos,"AC-DC","Who made who","1986");
        agregarVinilos(vinilos,"judas Priest","British steel","1980");
        agregarVinilos(vinilos,"judas Priest","Painkiller","1990");
        agregarVinilos(vinilos,"judas Priest","Defenders od the faith","1984");
        agregarVinilos(vinilos,"Kiss","Destroyer","1976");

        System.out.println("Espacio máximo coleccion: "+vinilos.length);

        mostrarTotal(vinilos);
        mostrarDisponible(vinilos);

        String artista = "AC-DC";
        System.out.println("Buscar artista: "+artista);
        mostrarBusquedaArtista(vinilos,artista);

        mostrarColeccion(vinilos);

    }
    public static String[][] agregarVinilos(String m[][],String grup, String lp, String año){
        for(int i =0; i<m.length;){
            if (m[i][0]!=null){
                i++;
            }
            if (m[i][0]==null){
                   m[i][0]=grup;
                   m[i][1]=lp;
                   m[i][2]=año;
                   break;
            }
        }

           return m;
    }
    public static int contadorVinilos(String m[][]){
        int contador = 0;
        for(int i =0; i<m.length;i++){
            if (m[i][0]!=null){
            contador++;
            }
            else if (m[i][0]==null){
                break;
            }
        }
        return contador;
    }
    public static void mostrarTotal(String m[][]){
        System.out.println("Hay un total de: "+ contadorVinilos(m)+" vinilos en la coleccion");
    }
    public static void mostrarDisponible(String m[][]){
        System.out.println("Hay un total de: "+ (100-contadorVinilos(m))+" espacios disponibles en la coleccion");
    }
    public static boolean buscarArtista(String m[][], String artista){
        for(int i =0; i<m.length;i++){
            if (m[i][0]==artista){
                return true;
            }
    }
    return false;
    }
    public static void mostrarBusquedaArtista(String m[][], String artista){
        if (buscarArtista(m,artista)==true){
            System.out.println("El artista "+artista+ " si está en la coleccion");
        }
        else {
            System.out.println("El artista "+artista+ " no está en la coleccion");
        }
    }
    public static void mostrarColeccion(String m[][]){
        for (int i=0;i<contadorVinilos(m);i++){
            System.out.println("Fila "+ (i+1)+": "+m[i][0]+" - "+m[i][1]+" - "+m[i][2]);
        }
    }
}
