//ALGORITMA PRIM'S

public class App {

    public void prim (int G[][], int V){
        int inf = 9999;
        int edge;
        int total=0;

        /* buat array dengan tipe data boolean untuk 
        memilih vertex yang telah dikunjungi, true jika 
        vertex sudah dikunjungi dan false jika tidak*/
        boolean[] dikunjungi = new boolean[V]; 

        //kita mulai dengan mengunjungi vertex indeks 0
        //mula mula banyak edge pada MST = 0
        dikunjungi[0] = true;
        edge = 0;

        /*karena jumlah edge pada MST selalu
        sama dengan jumlah vertex dikurang 1 (V-1),
        maka untuk mencari MST kita akan melakukan
        perulangan selama edge < V-1 */

        while(edge < V-1){
            int minimum = inf;
            int x = 0;
            int y = 0;

            for(int i=0; i<V; i++){
                if(dikunjungi[i]==true){
                    for(int j=0; j<V; j++){
                        if(!dikunjungi[j] && G[i][j]!=0){
                            if(minimum > G[i][j]){
                                minimum = G[i][j];
                                x=i;
                                y=j;                                
                            }
                        }
                    }
                }
            }
            System.out.println(x+" - "+y+" : "+minimum);
            total=total+minimum;
            dikunjungi[y]=true;
            edge++;
        }   
        System.out.println("Total MST = "+total);     
    }
    public static void main(String[] args) throws Exception {
        App g = new App();
        int V = 6;
        int G[][] = {{0 , 10, 0 , 30, 45, 0},
                     {10, 0 , 50, 0 , 40, 25},
                     {0 , 50, 0 , 0 , 35, 15},
                     {30, 0 , 0 , 0 , 0 , 55},
                     {45, 40, 35, 0 , 0 , 55},
                     {0 , 25, 15, 20, 55, 0 }};

        g.prim(G, V);

    }
}
