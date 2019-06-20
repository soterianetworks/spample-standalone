import {Injectable} from '@angular/core';

import {SpI18nService} from './i18n/sp-i18n.service';

@Injectable()
export class SpBootService {
    constructor(protected i18nService: SpI18nService) {
    }

    init() {
        this.registerI18n();
    }

    private registerI18n(): void {
        this.i18nService.init();
    }
}
