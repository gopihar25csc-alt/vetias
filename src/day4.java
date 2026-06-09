/*void main(){
    int[][] marks = new int[5][3];
    int[][] studentMarks = {
            {78, 90, 34},
            {89, 65, 89},
            {12, 34, 56},
            {66, 12, 89},
            {33, 77, 88}
    };
    for(int row = 0; row < studentMarks.length;row++){
        for(int col = 0; col < studentMarks[row] .length; col++){
            System.out.print(studentMarks[row][col] +" ");
        }
        System.out.println();
    }
}*/
    public static void main(String[]args){
        int[][] atttendance ={
                {0,1,0},
                {1,0,0},
                {1,1,1},
                {1,0,1},
                {0,0,0},
        };
        for(int row =0;row < atttendance.length;row++){
            System.out.print("student"+(row+1)+":");
            for(int column = 0; column < atttendance[row].length;column++){
                if(atttendance[row][column]==1){
                    System.out.println("class:"+(1+column)+":absent");
                }
                else{
                    System.out.println("class"+(1+column)+":absent");
                }
            }
            System.out.println();
        }
    }
