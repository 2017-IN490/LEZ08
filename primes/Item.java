package primes.erathostenes ;

abstract class Item {

// fields

    Item  next ;


// methods


    // costruttori (initialise)
    Item() {
	this.set(null) ;
    }   

    Item(Item tail) {
	this.set(tail) ;
    }   

    // di trasformazione (setters)
    void set ( Item list) {
	this.next = list ;
    }

    // di accesso (getters)
	
	int length() {
		Item lista = this ;
		int i = 0 ;
		
/*
 for(i=0;!(lista.next==null) ;i++ )
			{
				lista = lista.next;
			};
 */
		
		while((lista != null)) {
			i++ ;
			lista = lista. next ;
		}
		
		return i;
	}
	
	int rlength() {
		
		if (this.next==null) return 1;
			else
				return (next.rlength()+1);
	}

	abstract void print() ;
	
	
	abstract Token get() ;

}
