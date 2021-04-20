package pl.hrapp.domain.api;

import pl.hrapp.domain.data.Data;
import pl.hrapp.domain.data.DataDAO;
import pl.hrapp.domain.user.User;
import pl.hrapp.domain.user.UserDao;

import java.util.List;
import java.util.stream.Collectors;


public class DataService {
    private final DataDAO dataDAO = new DataDAO();
    private final DataMapper dataMapper = new DataMapper();

    public void add(DataSaveRequest saveRequest) {
        Data dataToSave = dataMapper.map(saveRequest);
        dataDAO.save(dataToSave);
    }
    public List<DataInfo> findAll() {
        return dataDAO.findAll()
                .stream().map(dataMapper::map)
                .collect(Collectors.toList());
    }


    private static class DataMapper {
        private final UserDao userDao  = new UserDao();

        DataInfo map(Data d) {
            return new DataInfo(

                    d.getName(),
                    d.getSurname(),
                    d.getUsername(),
                    d.getAddress(),
                    d.getEmail(),
                    d.getMarital_status()
            );
        }

        Data map(DataSaveRequest ds) {
            return new Data(

                    userDao.findByUsername(ds.getAuthor())
                            .orElseThrow()
                            .getUser_id(),
                    ds.getName(),
                    ds.getSurname(),
                    ds.getUsername(),
                    ds.getAddress(),
                    ds.getEmail(),
                    ds.getMarital_status()

            );
        }
    }
}