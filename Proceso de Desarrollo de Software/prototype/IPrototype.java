package prototype;

import java.io.Serializable;

public interface IPrototype<T extends IPrototype> extends Cloneable {
    public T clonacion();//clone
    public T clonacionProfunda();//deep clone
}

