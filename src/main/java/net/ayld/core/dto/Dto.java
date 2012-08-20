package net.ayld.core.dto;

import java.io.Serializable;

public interface Dto<I extends Serializable> extends Serializable{

	public I getId();
}
