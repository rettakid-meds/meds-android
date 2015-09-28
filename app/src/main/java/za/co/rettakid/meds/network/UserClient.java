package za.co.rettakid.meds.network;

import za.co.rettakid.meds.models.dto.*;

public class UserClient extends BaseClient   {

    public UserClient() {
        super("/users");
    }

    public UserListDto getUsers()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, UserListDto.class);
    }

    public UserDto getUsers(Long userId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, UserDto.class,userId);
    }

    public UserDto postUser(UserDto userDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, userDto, UserDto.class);
    }

    public UserListDto postUser(UserListDto userListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, userListDto, UserListDto.class);
    }

    public void putUser(UserDto userDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, userDto, UserDto.class,userDto.getUserId());
    }

    public void deleteUser(Long userId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,userId);
    }


    public UserDeviceListDto getUserDevices(Long userDevicesId)  {
        String url = createUrl("/{id}/userdevices");
        return getRestTemplate().getForObject(url, UserDeviceListDto.class,userDevicesId);
    }

    public DoctorListDto getDoctors(Long doctorId)  {
        String url = createUrl("/{id}/doctors");
        return getRestTemplate().getForObject(url, DoctorListDto.class,doctorId);
    }

    public AppointmentListDto getAppointments(Long appointmentId)  {
        String url = createUrl("/{id}/appointments");
        return getRestTemplate().getForObject(url, AppointmentListDto.class,appointmentId);
    }

    public PrescriptionListDto getPrescriptions(Long prescriptionId)  {
        String url = createUrl("/{id}/prescriptions");
        return getRestTemplate().getForObject(url, PrescriptionListDto.class,prescriptionId);
    }

}