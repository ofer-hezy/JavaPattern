/**
 * 
 */
package practice.demo.generic;

public class PairImp<K, V> implements Pair<K, V> {
	private K key;
	private V value;

	public PairImp(K key, V value) {
		this.value = value;
		this.key = key;
	}
	public K getKey() {
		return this.key;
	}
	public V getValue() {
		return this.value;
	}
}
