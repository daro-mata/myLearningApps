package pl.learning.numberToWords.suggestion;

import pl.learning.numberToWords.suggestion.printer.StringConverter;
import pl.learning.numberToWords.suggestion.service.NumberToWordTranslator;
import pl.learning.numberToWords.suggestion.validator.NumberValidator;
import pl.learning.numberToWords.suggestion.validator.Validator;

import java.util.List;

public class NumberDescriber {

    private final NumberToWordTranslator numberToWordTranslator;
    private final StringConverter converter;
    private final Validator numberValidator;

    public NumberDescriber() {
        this.numberToWordTranslator = new NumberToWordTranslator();
        this.converter = new StringConverter();
        this.numberValidator = new NumberValidator();
    }

    /**
     * Look at the accessor - only this method in whole package 'pl.learing.numberToWords.proposition' is public.
     * It's because that it's the only method we want to export to the world, we want others to use NumberToStringService only.
     * Other classes should not be visible to others.
     *
     * @param number - given number to be described by words
     * @return concatenated list of digits names
     */
    public String describeWithWords(int number) {
        numberValidator.validate(number);
        List<String> digitsRepresentedByWords = numberToWordTranslator.getAsWordList(number);
        return converter.joinListElements(digitsRepresentedByWords);
    }
}
