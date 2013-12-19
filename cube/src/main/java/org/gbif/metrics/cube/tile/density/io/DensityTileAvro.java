/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.gbif.metrics.cube.tile.density.io;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DensityTileAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DensityTileAvro\",\"namespace\":\"org.gbif.metrics.cube.tile.density.io\",\"fields\":[{\"name\":\"clusterSize\",\"type\":\"int\"},{\"name\":\"grids\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"GridAvro\",\"fields\":[{\"name\":\"cells\",\"type\":{\"type\":\"map\",\"values\":\"int\"}}]}}},{\"name\":\"x\",\"type\":\"int\",\"default\":0},{\"name\":\"y\",\"type\":\"int\",\"default\":0},{\"name\":\"zoom\",\"type\":\"int\",\"default\":0}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int clusterSize;
  @Deprecated public java.util.Map<java.lang.CharSequence,org.gbif.metrics.cube.tile.density.io.GridAvro> grids;
  @Deprecated public int x;
  @Deprecated public int y;
  @Deprecated public int zoom;

  /**
   * Default constructor.
   */
  public DensityTileAvro() {}

  /**
   * All-args constructor.
   */
  public DensityTileAvro(java.lang.Integer clusterSize, java.util.Map<java.lang.CharSequence,org.gbif.metrics.cube.tile.density.io.GridAvro> grids, java.lang.Integer x, java.lang.Integer y, java.lang.Integer zoom) {
    this.clusterSize = clusterSize;
    this.grids = grids;
    this.x = x;
    this.y = y;
    this.zoom = zoom;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return clusterSize;
    case 1: return grids;
    case 2: return x;
    case 3: return y;
    case 4: return zoom;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: clusterSize = (java.lang.Integer)value$; break;
    case 1: grids = (java.util.Map<java.lang.CharSequence,org.gbif.metrics.cube.tile.density.io.GridAvro>)value$; break;
    case 2: x = (java.lang.Integer)value$; break;
    case 3: y = (java.lang.Integer)value$; break;
    case 4: zoom = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'clusterSize' field.
   */
  public java.lang.Integer getClusterSize() {
    return clusterSize;
  }

  /**
   * Sets the value of the 'clusterSize' field.
   * @param value the value to set.
   */
  public void setClusterSize(java.lang.Integer value) {
    this.clusterSize = value;
  }

  /**
   * Gets the value of the 'grids' field.
   */
  public java.util.Map<java.lang.CharSequence,org.gbif.metrics.cube.tile.density.io.GridAvro> getGrids() {
    return grids;
  }

  /**
   * Sets the value of the 'grids' field.
   * @param value the value to set.
   */
  public void setGrids(java.util.Map<java.lang.CharSequence,org.gbif.metrics.cube.tile.density.io.GridAvro> value) {
    this.grids = value;
  }

  /**
   * Gets the value of the 'x' field.
   */
  public java.lang.Integer getX() {
    return x;
  }

  /**
   * Sets the value of the 'x' field.
   * @param value the value to set.
   */
  public void setX(java.lang.Integer value) {
    this.x = value;
  }

  /**
   * Gets the value of the 'y' field.
   */
  public java.lang.Integer getY() {
    return y;
  }

  /**
   * Sets the value of the 'y' field.
   * @param value the value to set.
   */
  public void setY(java.lang.Integer value) {
    this.y = value;
  }

  /**
   * Gets the value of the 'zoom' field.
   */
  public java.lang.Integer getZoom() {
    return zoom;
  }

  /**
   * Sets the value of the 'zoom' field.
   * @param value the value to set.
   */
  public void setZoom(java.lang.Integer value) {
    this.zoom = value;
  }

  /** Creates a new DensityTileAvro RecordBuilder */
  public static org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder newBuilder() {
    return new org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder();
  }
  
  /** Creates a new DensityTileAvro RecordBuilder by copying an existing Builder */
  public static org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder newBuilder(org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder other) {
    return new org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder(other);
  }
  
  /** Creates a new DensityTileAvro RecordBuilder by copying an existing DensityTileAvro instance */
  public static org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder newBuilder(org.gbif.metrics.cube.tile.density.io.DensityTileAvro other) {
    return new org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder(other);
  }
  
  /**
   * RecordBuilder for DensityTileAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DensityTileAvro>
    implements org.apache.avro.data.RecordBuilder<DensityTileAvro> {

    private int clusterSize;
    private java.util.Map<java.lang.CharSequence,org.gbif.metrics.cube.tile.density.io.GridAvro> grids;
    private int x;
    private int y;
    private int zoom;

    /** Creates a new Builder */
    private Builder() {
      super(org.gbif.metrics.cube.tile.density.io.DensityTileAvro.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing DensityTileAvro instance */
    private Builder(org.gbif.metrics.cube.tile.density.io.DensityTileAvro other) {
            super(org.gbif.metrics.cube.tile.density.io.DensityTileAvro.SCHEMA$);
      if (isValidValue(fields()[0], other.clusterSize)) {
        this.clusterSize = data().deepCopy(fields()[0].schema(), other.clusterSize);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.grids)) {
        this.grids = data().deepCopy(fields()[1].schema(), other.grids);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.x)) {
        this.x = data().deepCopy(fields()[2].schema(), other.x);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.y)) {
        this.y = data().deepCopy(fields()[3].schema(), other.y);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.zoom)) {
        this.zoom = data().deepCopy(fields()[4].schema(), other.zoom);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'clusterSize' field */
    public java.lang.Integer getClusterSize() {
      return clusterSize;
    }
    
    /** Sets the value of the 'clusterSize' field */
    public org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder setClusterSize(int value) {
      validate(fields()[0], value);
      this.clusterSize = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'clusterSize' field has been set */
    public boolean hasClusterSize() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'clusterSize' field */
    public org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder clearClusterSize() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'grids' field */
    public java.util.Map<java.lang.CharSequence,org.gbif.metrics.cube.tile.density.io.GridAvro> getGrids() {
      return grids;
    }
    
    /** Sets the value of the 'grids' field */
    public org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder setGrids(java.util.Map<java.lang.CharSequence,org.gbif.metrics.cube.tile.density.io.GridAvro> value) {
      validate(fields()[1], value);
      this.grids = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'grids' field has been set */
    public boolean hasGrids() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'grids' field */
    public org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder clearGrids() {
      grids = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'x' field */
    public java.lang.Integer getX() {
      return x;
    }
    
    /** Sets the value of the 'x' field */
    public org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder setX(int value) {
      validate(fields()[2], value);
      this.x = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'x' field has been set */
    public boolean hasX() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'x' field */
    public org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder clearX() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'y' field */
    public java.lang.Integer getY() {
      return y;
    }
    
    /** Sets the value of the 'y' field */
    public org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder setY(int value) {
      validate(fields()[3], value);
      this.y = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'y' field has been set */
    public boolean hasY() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'y' field */
    public org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder clearY() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'zoom' field */
    public java.lang.Integer getZoom() {
      return zoom;
    }
    
    /** Sets the value of the 'zoom' field */
    public org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder setZoom(int value) {
      validate(fields()[4], value);
      this.zoom = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'zoom' field has been set */
    public boolean hasZoom() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'zoom' field */
    public org.gbif.metrics.cube.tile.density.io.DensityTileAvro.Builder clearZoom() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public DensityTileAvro build() {
      try {
        DensityTileAvro record = new DensityTileAvro();
        record.clusterSize = fieldSetFlags()[0] ? this.clusterSize : (java.lang.Integer) defaultValue(fields()[0]);
        record.grids = fieldSetFlags()[1] ? this.grids : (java.util.Map<java.lang.CharSequence,org.gbif.metrics.cube.tile.density.io.GridAvro>) defaultValue(fields()[1]);
        record.x = fieldSetFlags()[2] ? this.x : (java.lang.Integer) defaultValue(fields()[2]);
        record.y = fieldSetFlags()[3] ? this.y : (java.lang.Integer) defaultValue(fields()[3]);
        record.zoom = fieldSetFlags()[4] ? this.zoom : (java.lang.Integer) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}