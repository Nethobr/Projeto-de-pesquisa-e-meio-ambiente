package nethobr.pacote;

public class Pergunta 
{
	public int numPergunta;
	public int sim = 0, nao = 0, noResp = 0;
	
	public int qtdResp ()
	{
		return (sim + nao + noResp);
	}	//fim qtdResp ()
	public double getPercentS ()
	{
		return (sim * 100) / (sim + nao + noResp);
	}	//fim getPercentS ()
	public double getPercentN ()
	{
		return (nao * 100) / (sim + nao + noResp);
	}	// fim getPercentN ()
	public double getPercentResp ()
	{
		return (noResp * 100) / (sim + nao + noResp);
	}	//fim getPercentResp ()
}	//fim Pergunta
