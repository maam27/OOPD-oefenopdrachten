color colour1 = #FFFFFF;
color colour2 = #000000;

DamSteen[] stenen = new DamSteen[]{
  new DamSteen(50,50,colour1,50),
  new DamSteen(150,50,colour1,50),
  new DamSteen(50,150,colour2,50),
  new DamSteen(150,150,colour2,50)

};

void setup() {
  size(800,600);
  stenen[2].isGeselecteerd = true;
}

void draw(){
  tekenStenen(stenen);
  println(stenen[2].toString());
}

void tekenStenen(DamSteen[] stenen){
  for(DamSteen s : stenen)
    s.teken();
}