import {Injectable} from '@angular/core';

import {EnhancedHttpClient} from 'spase-ui';
import {Observable} from 'rxjs';
import {CipUserProfile} from './cip.model';
import {map} from 'rxjs/operators';

@Injectable()
export class CipService {
    constructor(protected http: EnhancedHttpClient) {
    }

    getCurrentProfile(): Observable<CipUserProfile> {
        return this.http.get('/gateway/iamsvc/my/user-profile?benity=1&group=1&role=1&permission=1&department=1')
            .pipe(map(res => CipUserProfile.instance(res)));
    }
}
