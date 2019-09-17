import es.ulpgc.SMQueue;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SMQueue_ {
    @Test
    public void given_a_single_queue() {
        assertThat(SMQueue.timeToCheckoutOf(new Integer[]{ 5,3,4 }, 1)).isEqualTo(12);
    }

    @Test
    public void given_two_queues() {
        assertThat(SMQueue.timeToCheckoutOf(new Integer[]{ 5,3,4 },2)).isEqualTo(7);
    }
}
