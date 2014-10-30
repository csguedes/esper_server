package com.csg.model.ctm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ACCOUNTS")
public class ACCOUNTS
{
    private String NAME;

    private String DESCRIPTION;

    private String DOMAIN;

    private String STATUS;

    
    
 	@Override
	public String toString() {
		return "ACCOUNTS [NAME=" + NAME + ", DESCRIPTION=" + DESCRIPTION
				+ ", DOMAIN=" + DOMAIN + ", STATUS=" + STATUS + "]";
	}

	public String getNAME ()
    {
        return NAME;
    }

	@XmlElement
    public void setNAME (String NAME)
    {
        this.NAME = NAME;
    }

    public String getDESCRIPTION ()
    {
        return DESCRIPTION;
    }

	@XmlElement
    public void setDESCRIPTION (String DESCRIPTION)
    {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getDOMAIN ()
    {
        return DOMAIN;
    }

	@XmlElement
   public void setDOMAIN (String DOMAIN)
    {
        this.DOMAIN = DOMAIN;
    }

    public String getSTATUS ()
    {
        return STATUS;
    }

	@XmlElement
    public void setSTATUS (String STATUS)
    {
        this.STATUS = STATUS;
    }
	
	
}
	