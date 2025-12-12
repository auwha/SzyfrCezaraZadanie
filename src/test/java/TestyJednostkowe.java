import org.example.Szyfr;
import org.junit.Assert;
import org.junit.Test;

public class TestyJednostkowe {
    @Test
    public void zwracaDlaDodatniegoKlucza() {
        Szyfr szyfr = new Szyfr("abc", 3);

        String zaszyfrowany = szyfr.szyfrujTekst();

        Assert.assertEquals("def", zaszyfrowany);
    }

    @Test
    public void zwracaDlaLiterWykraczajacychAlfabet() {
        Szyfr szyfr = new Szyfr("xyz", 3);

        String zaszyfrowany = szyfr.szyfrujTekst();

        Assert.assertEquals("abc", zaszyfrowany);
    }

    @Test
    public void zwracaDlaUjemnegoKlucza() {
        Szyfr szyfr = new Szyfr("def", -3);

        String zaszyfrowany = szyfr.szyfrujTekst();

        Assert.assertEquals("abc", zaszyfrowany);
    }

    @Test
    public void zwracaDlaKluczaWiekszegoNizAlfabet() {
        Szyfr szyfr = new Szyfr("abc", 29);

        String zaszyfrowany = szyfr.szyfrujTekst();

        Assert.assertEquals("def", zaszyfrowany);
    }

    @Test
    public void zwracaSpacjiWTekscie() {
        Szyfr szyfr = new Szyfr("ab cd", 2);

        String zaszyfrowany = szyfr.szyfrujTekst();

        Assert.assertEquals("cd ef", zaszyfrowany);
    }
}
