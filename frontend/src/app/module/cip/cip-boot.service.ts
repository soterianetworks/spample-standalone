import {Injectable} from '@angular/core';

import {CipI18nService} from './i18n/cip-i18n.service';

@Injectable()
export class CipBootService {
    constructor(protected i18nService: CipI18nService) {
    }

    init() {
        this.registerI18n();
    }

    private registerI18n(): void {
        this.i18nService.init();
    }
}
