/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package btllib;

public class SeedNtHash {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SeedNtHash(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SeedNtHash obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        btllibJNI.delete_SeedNtHash(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SeedNtHash(String seq, long seq_len, long k, SWIGTYPE_p_std__vectorT_std__vectorT_unsigned_int_t_t seeds, long hash_num_per_seed, long pos) {
    this(btllibJNI.new_SeedNtHash__SWIG_0(seq, seq_len, k, SWIGTYPE_p_std__vectorT_std__vectorT_unsigned_int_t_t.getCPtr(seeds), hash_num_per_seed, pos), true);
  }

  public SeedNtHash(String seq, long seq_len, long k, SWIGTYPE_p_std__vectorT_std__vectorT_unsigned_int_t_t seeds, long hash_num_per_seed) {
    this(btllibJNI.new_SeedNtHash__SWIG_1(seq, seq_len, k, SWIGTYPE_p_std__vectorT_std__vectorT_unsigned_int_t_t.getCPtr(seeds), hash_num_per_seed), true);
  }

  public SeedNtHash(String seq, long k, SWIGTYPE_p_std__vectorT_std__vectorT_unsigned_int_t_t seeds, long hash_num_per_seed, long pos) {
    this(btllibJNI.new_SeedNtHash__SWIG_2(seq, k, SWIGTYPE_p_std__vectorT_std__vectorT_unsigned_int_t_t.getCPtr(seeds), hash_num_per_seed, pos), true);
  }

  public SeedNtHash(String seq, long k, SWIGTYPE_p_std__vectorT_std__vectorT_unsigned_int_t_t seeds, long hash_num_per_seed) {
    this(btllibJNI.new_SeedNtHash__SWIG_3(seq, k, SWIGTYPE_p_std__vectorT_std__vectorT_unsigned_int_t_t.getCPtr(seeds), hash_num_per_seed), true);
  }

  public SeedNtHash(String seq, long seq_len, long k, SWIGTYPE_p_std__vectorT_std__string_t seeds, long hash_num_per_seed, long pos) {
    this(btllibJNI.new_SeedNtHash__SWIG_4(seq, seq_len, k, SWIGTYPE_p_std__vectorT_std__string_t.getCPtr(seeds), hash_num_per_seed, pos), true);
  }

  public SeedNtHash(String seq, long seq_len, long k, SWIGTYPE_p_std__vectorT_std__string_t seeds, long hash_num_per_seed) {
    this(btllibJNI.new_SeedNtHash__SWIG_5(seq, seq_len, k, SWIGTYPE_p_std__vectorT_std__string_t.getCPtr(seeds), hash_num_per_seed), true);
  }

  public SeedNtHash(String seq, long k, SWIGTYPE_p_std__vectorT_std__string_t seeds, long hash_num_per_seed, long pos) {
    this(btllibJNI.new_SeedNtHash__SWIG_6(seq, k, SWIGTYPE_p_std__vectorT_std__string_t.getCPtr(seeds), hash_num_per_seed, pos), true);
  }

  public SeedNtHash(String seq, long k, SWIGTYPE_p_std__vectorT_std__string_t seeds, long hash_num_per_seed) {
    this(btllibJNI.new_SeedNtHash__SWIG_7(seq, k, SWIGTYPE_p_std__vectorT_std__string_t.getCPtr(seeds), hash_num_per_seed), true);
  }

  public SWIGTYPE_p_uint64_t hashes() {
    long cPtr = btllibJNI.SeedNtHash_hashes(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint64_t(cPtr, false);
  }

  public long get_pos() {
    return btllibJNI.SeedNtHash_get_pos(swigCPtr, this);
  }

  public boolean forward() {
    return btllibJNI.SeedNtHash_forward(swigCPtr, this);
  }

  public long get_k() {
    return btllibJNI.SeedNtHash_get_k(swigCPtr, this);
  }

  public long get_hash_num() {
    return btllibJNI.SeedNtHash_get_hash_num(swigCPtr, this);
  }

  public long get_hash_num_per_seed() {
    return btllibJNI.SeedNtHash_get_hash_num_per_seed(swigCPtr, this);
  }

  public boolean roll() {
    return btllibJNI.SeedNtHash_roll(swigCPtr, this);
  }

}