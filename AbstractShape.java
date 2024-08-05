package gr.aueb.cf.ch17.homework;

import gr.aueb.cf.ch16.homework.p1.IShape;

public abstract class AbstractShape implements IShape {
    protected long id;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
