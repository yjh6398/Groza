package com.sanshengshui.server.service.security.device;

import com.sanshengshui.server.common.data.Device;
import com.sanshengshui.server.common.data.id.DeviceId;
import com.sanshengshui.server.common.data.security.DeviceCredentialsFilter;
import com.sanshengshui.server.common.transport.auth.DeviceAuthResult;
import com.sanshengshui.server.common.transport.auth.DeviceAuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author james mu
 * @date 18-12-21 上午11:07
 */
@Slf4j
@Service
public class DefaultDeviceAuthService implements DeviceAuthService {

    @Override
    public DeviceAuthResult process(DeviceCredentialsFilter credentials) {
        return null;
    }

    @Override
    public Optional<Device> findDeviceById(DeviceId deviceId) {
        return Optional.empty();
    }
}
