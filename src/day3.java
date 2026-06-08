/*void main (){
    int n=5;
    for(int row=1;row<=n;row++){
        for(int column=1;column<=row;column++){
            System.out.print(column);
        }
        System.out.println();
    }
}*/
void main() {
    int[] marks= {87,32,44,89,23};
    System.out.println("pass marl");
    for(int mark: marks){
        if(mark>=40){
            System.out.println(mark+"");
        }
    }
    System.out.println("fail marks");
    for(int mark:marks){
        if(mark<40){
            System.out.println(mark+"");
        }
}
}
