package pattern.state;

import storage.configuration.Language;
import storage.entity.VivoPhone;

/**
 * 状态模式
 *
 * @author decmoon
 */
public class VivoPhoneState {

    private enum VivoState {
        TURN_ON(TurnOn.getInstance()),
        TURN_OFF(TurnOff.getInstance());

        private State state;

        VivoState(State state) {
            this.state = state;
        }

        public State getState() {
            return state;
        }
    }

    private VivoPhone vivoPhone;
    private VivoState nowState;

    public VivoPhoneState() {
        vivoPhone = new VivoPhone();
        nowState = VivoState.TURN_OFF;
    }

    public void turnOn(Language language) {
        vivoPhone.turnOn(language);
        nowState = VivoState.TURN_ON;
    }

    public void turnOff(Language language) {
        vivoPhone.turnOff(language);
        nowState = VivoState.TURN_OFF;
    }

    public void canDo(Language language) {
        nowState.getState().canDo(language);
    }
}
