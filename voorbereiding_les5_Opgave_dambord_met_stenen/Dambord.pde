class Dambord{
  Damsteen[] stenen;
  
  int x;
  int y;
  int breedte;
  int hoogte;
  
  public Dambord(){
    this.x=0;
    this.y=0;
    this.breedte = width;
    this.hoogte = height;
      
    color colour1 = #FFFFFF;
    color colour2 = #000000;
    
    this.stenen = new Damsteen[]{
      new Damsteen(50,50,colour1,50),
      new Damsteen(150,50,colour1,50),
      new Damsteen(50,150,colour2,50),
      new Damsteen(150,150,colour2,50)};
  }

 public Dambord(int x,int y, int breedte, int hoogte){   
   this.x=x;
    this.y=y;
    this.breedte = breedte;
    this.hoogte = hoogte;
      
    color colour1 = #FFFFFF;
    color colour2 = #000000;
    
    this.stenen = new Damsteen[]{
      new Damsteen(50,50,colour1,50),
      new Damsteen(150,50,colour1,50),
      new Damsteen(50,150,colour2,50),
      new Damsteen(150,150,colour2,50)};
  }
  
  void teken(){
    int vBreedte = this.breedte/8;
    int vHoogte = this.hoogte/8;
    
    for(int ii=0;ii<8;ii++){
      for(int i=0;i<8;i++){
        fill(0); 
        if(i%2==0){
          if(ii%2==0){
            fill(255);
          }
        }else if(i%2==1){
          if(ii%2==1){
            fill(255);
          }
        }
        rect(x+i*vBreedte,y+ii*vHoogte,vBreedte, vHoogte);
      }
    }
    
    
  }
  
  void tekenDamstenen(){
    for(Damsteen s : this.stenen)
    s.teken();
  }
}