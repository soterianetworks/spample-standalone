import {Injectable} from '@angular/core';

import {EnhancedHttpClient} from 'spase-ui';
import {Observable} from 'rxjs';
import {SpUserProfile} from './sp.model';
import {map} from 'rxjs/operators';

@Injectable()
export class SpService {
    constructor(protected http: EnhancedHttpClient) {
    }

    getCurrentProfile(): Observable<SpUserProfile> {
        return this.http.get('/api/my-profile?benity=1&group=1&role=1&permission=1&department=1')
            .pipe(map(res => SpUserProfile.instance(res)));
    }
}
