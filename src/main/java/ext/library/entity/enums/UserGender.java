package ext.library.entity.enums;

import com.mybatisflex.annotation.EnumValue;
import ext.library.util.Assert;
import io.github.linpeilie.annotations.AutoEnumMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

@Getter
@AllArgsConstructor
@AutoEnumMapper("code")
public enum UserGender {
    MAN(1, "男"),
    WOMAN(2, "女");
    @EnumValue
    private final Integer code;
    private final String desc;

    public static UserGender map(Integer code) {
        Optional<UserGender> result = Arrays.stream(UserGender.values()).filter(item -> code.equals(item.code))
                .findFirst();
        Assert.isFalse(result.isEmpty(), "未找到指定的枚举，code:{}", code);
        return result.get();
    }
}
