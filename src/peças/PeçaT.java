package peças;
public class PeçaT extends Peça {

	public PeçaT(){
		super();
		tipo='t';
	}
	public PeçaT(int coorX, int coorY, Bloco[][] matrizBlocos) {
		super(coorX,coorY,matrizBlocos);
	}
	
	public void AtualizarBlocosDaPeça(){
		switch(rotação){
		case NORMAL:			
			blocosDaPeça[0]= matrizLocal[coorCentralX][coorCentralY];
			blocosDaPeça[1]=matrizLocal[coorCentralX - 1][coorCentralY];
			blocosDaPeça[2]=matrizLocal[coorCentralX][coorCentralY - 1];
			blocosDaPeça[3]=matrizLocal[coorCentralX][coorCentralY + 1];
			break;
		case DIREIRA:
			blocosDaPeça[0]= matrizLocal[coorCentralX][coorCentralY];
			blocosDaPeça[1]=matrizLocal[coorCentralX - 1][coorCentralY];
			blocosDaPeça[2]=matrizLocal[coorCentralX + 1][coorCentralY];
			blocosDaPeça[3]=matrizLocal[coorCentralX][coorCentralY + 1];
			break;
		case BAIXO:
			blocosDaPeça[0]= matrizLocal[coorCentralX][coorCentralY];
			blocosDaPeça[1]=matrizLocal[coorCentralX + 1][coorCentralY];
			blocosDaPeça[2]=matrizLocal[coorCentralX][coorCentralY - 1];
			blocosDaPeça[3]=matrizLocal[coorCentralX][coorCentralY + 1];
			break;
		case ESQUERDA:
			blocosDaPeça[0]= matrizLocal[coorCentralX][coorCentralY];
			blocosDaPeça[1]=matrizLocal[coorCentralX - 1][coorCentralY];
			blocosDaPeça[2]=matrizLocal[coorCentralX + 1][coorCentralY];
			blocosDaPeça[3]=matrizLocal[coorCentralX][coorCentralY - 1];
			break;
			
		}
	}
}
    