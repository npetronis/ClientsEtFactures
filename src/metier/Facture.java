package metier;

import java.time.LocalDate;


public class Facture
{
	private int montant;
	private LocalDate date;
	private boolean estReglee;
	private Client client;

	private Facture facture;

	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	
	public Facture(int montant) throws factureexception
	{
		if(montant > 0)
			this.montant = montant;
		else
			throw new factureexception();
	}
	public Client getClient()
	{
		return this.client;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return this.montant;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		return this.estReglee;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return date;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{	
	
		return null;
	}


	//setters
	public void setMontant(int montant)
	{
		this.montant = montant;
	}

	public void setDate(LocalDate date)
	{
		this.date = date;
	}

	public void setEstReglee(boolean estReglee)
	{
		this.estReglee = estReglee;
	}

	public void setClient(Client client)
	{
		this.client = client;
	}
	public Facture getFacture(Facture facture)
	{
		return this.facture = facture;
	}
	
	class factureexception extends java.lang.IllegalArgumentException
	{
		@override
			public string getMessage("Le montant d'une facture ne peut pas être négatif.");
	}
}