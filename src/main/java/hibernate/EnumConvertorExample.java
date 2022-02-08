package hibernate;

import javax.persistence.AttributeConverter;

public class EnumConvertorExample implements AttributeConverter<Gender, Character> {
    @Override
    public Character convertToDatabaseColumn(Gender gender) {
        if (gender == null) {
            return null;
        } else
            return gender.getCode();

    }

    @Override
    public Gender convertToEntityAttribute(Character value) {
        return value.equals('M') ? Gender.MALE : Gender.FEMALE;
    }
}
