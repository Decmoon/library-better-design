package pattern.state;

import storage.configuration.Language;

/**
 * 状态
 *
 * @author decmoon
 */
public interface State {

    void canDo(Language language);
}
